package com.example.instagramclone;
import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("buvmzQPFTkwuZtVfIRNWK9qk6kU08FZvIifv2E8t")
                .clientKey("LkM9X28VwEiEO5hdymkqUGFYmU7fhsuRp0xESM3Z")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
