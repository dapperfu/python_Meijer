package com.meijer.mobile.meijer.activity.home;

/* loaded from: classes10.dex */
public final class HomeViewModel_HiltModules {

    public static abstract class BindsModule {
        public abstract androidx.view.c0 binds(HomeViewModel homeViewModel);

        private BindsModule() {
        }
    }

    public static final class KeyModule {
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }

    private HomeViewModel_HiltModules() {
    }
}
