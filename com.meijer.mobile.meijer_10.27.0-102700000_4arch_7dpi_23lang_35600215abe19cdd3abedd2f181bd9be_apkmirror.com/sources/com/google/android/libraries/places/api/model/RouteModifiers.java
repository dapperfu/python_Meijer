package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes6.dex */
public abstract class RouteModifiers implements Parcelable {

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract RouteModifiers build();

        public abstract boolean isFerryAvoided();

        public abstract boolean isHighwayAvoided();

        public abstract boolean isIndoorAvoided();

        public abstract boolean isTollAvoided();

        @RecentlyNonNull
        public abstract Builder setFerryAvoided(boolean z10);

        @RecentlyNonNull
        public abstract Builder setHighwayAvoided(boolean z10);

        @RecentlyNonNull
        public abstract Builder setIndoorAvoided(boolean z10);

        @RecentlyNonNull
        public abstract Builder setTollAvoided(boolean z10);
    }

    public abstract boolean isFerryAvoided();

    public abstract boolean isHighwayAvoided();

    public abstract boolean isIndoorAvoided();

    public abstract boolean isTollAvoided();

    @RecentlyNonNull
    public static Builder builder() {
        zzbb zzbbVar = new zzbb();
        zzbbVar.setTollAvoided(false);
        zzbbVar.setHighwayAvoided(false);
        zzbbVar.setFerryAvoided(false);
        zzbbVar.setIndoorAvoided(false);
        return zzbbVar;
    }
}
