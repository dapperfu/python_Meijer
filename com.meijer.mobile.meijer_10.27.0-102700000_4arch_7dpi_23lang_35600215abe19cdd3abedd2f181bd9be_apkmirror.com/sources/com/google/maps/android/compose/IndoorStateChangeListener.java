package com.google.maps.android.compose;

import Md.C4186l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/google/maps/android/compose/IndoorStateChangeListener;", "", "", "onIndoorBuildingFocused", "()V", "LMd/l;", "building", "onIndoorLevelActivated", "(LMd/l;)V", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface IndoorStateChangeListener {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onIndoorLevelActivated(IndoorStateChangeListener indoorStateChangeListener, C4186l building) {
            Intrinsics.j(building, "building");
            IndoorStateChangeListener.super.onIndoorLevelActivated(building);
        }

        @Deprecated
        public static void onIndoorBuildingFocused(IndoorStateChangeListener indoorStateChangeListener) {
            IndoorStateChangeListener.super.onIndoorBuildingFocused();
        }
    }

    default void onIndoorBuildingFocused() {
    }

    default void onIndoorLevelActivated(C4186l building) {
        Intrinsics.j(building, "building");
    }
}
