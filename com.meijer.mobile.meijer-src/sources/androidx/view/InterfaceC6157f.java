package androidx.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/f;", "Landroidx/lifecycle/r;", "Landroidx/lifecycle/s;", "owner", "", "onCreate", "(Landroidx/lifecycle/s;)V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6157f extends InterfaceC6171r {
    default void onCreate(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
    }

    default void onDestroy(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
    }

    default void onPause(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
    }

    default void onResume(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
    }

    default void onStart(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
    }

    default void onStop(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
    }
}
