package com.mastodon.Preferences;

public interface Preferences {

    interface PrefNames {
        String PREFS_NAME_TAG = "com.mastodon.Preferences";
    }

    enum PrefKeys {
        IS_TIMER_EXPIRED,
        TOKEN,
        INSTALLATION_TIME
    }
}