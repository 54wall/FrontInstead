package pri.weiqiang.tryit.dagger2.example2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MainModule.class})
public interface MainComponent {

    void inject(DaggerE2Activity daggerE1Activity);
}
