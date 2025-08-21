package com.bugsnag.android;

import com.bugsnag.android.e1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/n0;", "Lcom/bugsnag/android/m;", "", "Lcom/bugsnag/android/o0;", "featureFlags", "<init>", "(Lcom/bugsnag/android/o0;)V", "", "c", "()V", "", "Lcom/bugsnag/android/m0;", "e", "()Ljava/util/List;", "b", "()Lcom/bugsnag/android/n0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/bugsnag/android/o0;", "d", "()Lcom/bugsnag/android/o0;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.n0, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class FeatureFlagState extends C6606m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final C6611o0 featureFlags;

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureFlagState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FeatureFlagState) && Intrinsics.e(this.featureFlags, ((FeatureFlagState) other).featureFlags);
    }

    public int hashCode() {
        return this.featureFlags.hashCode();
    }

    public String toString() {
        return "FeatureFlagState(featureFlags=" + this.featureFlags + ')';
    }

    public /* synthetic */ FeatureFlagState(C6611o0 c6611o0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C6611o0() : c6611o0);
    }

    public final FeatureFlagState b() {
        return new FeatureFlagState(this.featureFlags.b());
    }

    /* renamed from: d, reason: from getter */
    public final C6611o0 getFeatureFlags() {
        return this.featureFlags;
    }

    public final List<C6607m0> e() {
        return this.featureFlags.c();
    }

    public final void c() {
        for (C6607m0 c6607m0 : e()) {
            String key = c6607m0.getKey();
            String value = c6607m0.getValue();
            if (!getObservers$bugsnag_android_core_release().isEmpty()) {
                e1.b bVar = new e1.b(key, value);
                Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
                while (it.hasNext()) {
                    ((R6.r) it.next()).onStateChange(bVar);
                }
            }
        }
    }

    public FeatureFlagState(C6611o0 c6611o0) {
        this.featureFlags = c6611o0;
    }
}
