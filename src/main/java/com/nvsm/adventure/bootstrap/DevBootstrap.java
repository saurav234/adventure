package com.nvsm.adventure.bootstrap;

import com.nvsm.adventure.model.BaseActivity;
import com.nvsm.adventure.model.repositories.ActivityRepository;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private ActivityRepository activityRepository;

    public DevBootstrap(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    private void initData() {
        BaseActivity ac1 = new BaseActivity();
        BaseActivity ac2 = new BaseActivity();
        BaseActivity ac3 = new BaseActivity();
        BaseActivity ac4 = new BaseActivity();
        BaseActivity ac5 = new BaseActivity();



        ac1.setName("Kasol Kheerganga Trek");
        ac1.setCost(15000.00);
        ac1.setDescription("We begin this Kheerganga trek from Kasol, which is among the most famous hill stations in the Pin Parvati Valley. From here, you will be taken to the hamlet of Barshaini to begin the on-foot journey. The 12-km trail from here provides you with ample opportunities to explore the natural bounties of the region. On the way, you will find numerous charming waterfalls that will convince you with their allure to take a picture.");
        ac1.setImage("/images/pic01.jpg");

        ac2.setName("Malana Trek");
        ac2.setCost(15000.00);
        ac2.setDescription("Overlooked by Chandrakhani and Deo Tibba Peaks, Malana is a quaint little hamlet located in the dreamy surroundings in the Parvati Valley. The Village guarded by towering peaks is certainly not easy to climb and one has to complete the Malana Trek after traversing the Malana Nallah that flows right across the Parvati Valley. The 5 km trek from Malana Taxi stand to the village tucked at 10000 feet is one of the engrossing day treks you would ever take.");
        ac2.setImage("/images/pic02.jpg");

        ac3.setName("Triund Trek");
        ac3.setCost(15000.00);
        ac3.setDescription("Triund Trek is a perfect getaway to the heights in McLeodganj. Situated between the Dhauladhar Mountains and Kangra valley, Triund Trek is one of the most sought-after treks in Himachal Pradesh. Triund Trek is not a tough nut to crack but it nevertheless gifts you the stunning views and thrills any other high altitude treks can give. The trail goes through the forest of deodar, rhododendron and oak, the fresh air here will soothe your mind and muscles while you negotiate the tough curves.");
        ac3.setImage("/images/pic03.jpg");

        ac4.setName("Magic Valley Trek");
        ac4.setCost(15000.00);
        ac4.setDescription("This trek will introduce you to the less traveled trails of the beautiful and peaceful valley in the Himalayas. Magic Valley as the name suggests is known for its mesmerizing beauty that it offers throughout its trail. The view is truly fascinating and the purity of the environment will keep you awestruck throughout your journey.");
        ac4.setImage("/images/pic04.jpg");

        ac5.setName("Kheerganga Trek");
        ac5.setCost(15000.00);
        ac5.setDescription("Kasol in the midst of Parvati Valley is a trekking paradise in Himachal Pradesh. Kasol offers an experience of lush green valleys with the elegant Parvati River flowing alongside like a pearl necklace. Trekkers and nature lovers from across the globe visit this place. And surprisingly many of them choose to stay. Kheerganga trek happens to be the most popular of treks in Parvati Valley.");
        ac5.setImage("/images/pic01.jpg");

        activityRepository.save(ac1);
        activityRepository.save(ac2);
        activityRepository.save(ac3);
        activityRepository.save(ac4);
        activityRepository.save(ac5);


    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }
}
