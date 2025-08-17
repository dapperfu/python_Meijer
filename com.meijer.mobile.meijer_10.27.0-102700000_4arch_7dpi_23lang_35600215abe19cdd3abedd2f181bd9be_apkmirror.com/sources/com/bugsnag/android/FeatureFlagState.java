package com.bugsnag.android;

import com.bugsnag.android.T0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/bugsnag/android/d0;", "Lcom/bugsnag/android/j;", "", "Lcom/bugsnag/android/e0;", "featureFlags", "<init>", "(Lcom/bugsnag/android/e0;)V", "", "b", "()V", "", "Lcom/bugsnag/android/c0;", "d", "()Ljava/util/List;", "a", "()Lcom/bugsnag/android/d0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/bugsnag/android/e0;", "c", "()Lcom/bugsnag/android/e0;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.d0, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class FeatureFlagState extends C6475j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final C6466e0 featureFlags;

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureFlagState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this != other) {
            return (other instanceof FeatureFlagState) && Intrinsics.e(this.featureFlags, ((FeatureFlagState) other).featureFlags);
        }
        return true;
    }

    public int hashCode() {
        C6466e0 c6466e0 = this.featureFlags;
        if (c6466e0 != null) {
            return c6466e0.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "FeatureFlagState(featureFlags=" + this.featureFlags + ")";
    }

    public /* synthetic */ FeatureFlagState(C6466e0 c6466e0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C6466e0(null, 1, null) : c6466e0);
    }

    public final FeatureFlagState a() {
        return new FeatureFlagState(this.featureFlags.b());
    }

    /* renamed from: c, reason: from getter */
    public final C6466e0 getFeatureFlags() {
        return this.featureFlags;
    }

    public final List<C6462c0> d() {
        return this.featureFlags.c();
    }

    public FeatureFlagState(C6466e0 c6466e0) {
        this.featureFlags = c6466e0;
    }

    public final void b() {
        for (C6462c0 c6462c0 : d()) {
            String name = c6462c0.getKey();
            String value = c6462c0.getValue();
            if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                Intrinsics.f(name, "name");
                T0.b bVar = new T0.b(name, value);
                Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
                while (it.hasNext()) {
                    ((Q6.l) it.next()).onStateChange(bVar);
                }
            }
        }
    }
}
