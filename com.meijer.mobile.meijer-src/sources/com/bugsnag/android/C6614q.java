package com.bugsnag.android;

import R6.ImmutableConfig;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u0011\u0010\u001dR\u0017\u0010\"\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006("}, d2 = {"Lcom/bugsnag/android/q;", "", "LR6/k;", "cfg", "Lcom/bugsnag/android/x;", "configuration", "<init>", "(LR6/k;Lcom/bugsnag/android/x;)V", "Lcom/bugsnag/android/I0;", "a", "(Lcom/bugsnag/android/x;)Lcom/bugsnag/android/I0;", "Lcom/bugsnag/android/u;", "Lcom/bugsnag/android/u;", "d", "()Lcom/bugsnag/android/u;", "clientObservable", "Lcom/bugsnag/android/r;", "b", "Lcom/bugsnag/android/r;", "c", "()Lcom/bugsnag/android/r;", "callbackState", "Lcom/bugsnag/android/C;", "Lcom/bugsnag/android/C;", "e", "()Lcom/bugsnag/android/C;", "contextState", "Lcom/bugsnag/android/BreadcrumbState;", "Lcom/bugsnag/android/BreadcrumbState;", "()Lcom/bugsnag/android/BreadcrumbState;", "breadcrumbState", "Lcom/bugsnag/android/I0;", "g", "()Lcom/bugsnag/android/I0;", "metadataState", "Lcom/bugsnag/android/n0;", "f", "Lcom/bugsnag/android/n0;", "()Lcom/bugsnag/android/n0;", "featureFlagState", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6614q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6621u clientObservable = new C6621u();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CallbackState callbackState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C contextState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final BreadcrumbState breadcrumbState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final MetadataState metadataState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final FeatureFlagState featureFlagState;

    private final MetadataState a(C6627x configuration) {
        return configuration.f64471a.metadataState.f(configuration.f64471a.metadataState.getMetadata().e());
    }

    /* renamed from: b, reason: from getter */
    public final BreadcrumbState getBreadcrumbState() {
        return this.breadcrumbState;
    }

    /* renamed from: c, reason: from getter */
    public final CallbackState getCallbackState() {
        return this.callbackState;
    }

    /* renamed from: d, reason: from getter */
    public final C6621u getClientObservable() {
        return this.clientObservable;
    }

    /* renamed from: e, reason: from getter */
    public final C getContextState() {
        return this.contextState;
    }

    /* renamed from: f, reason: from getter */
    public final FeatureFlagState getFeatureFlagState() {
        return this.featureFlagState;
    }

    /* renamed from: g, reason: from getter */
    public final MetadataState getMetadataState() {
        return this.metadataState;
    }

    public C6614q(ImmutableConfig immutableConfig, C6627x c6627x) {
        CallbackState callbackState = c6627x.f64471a.callbackState;
        this.callbackState = callbackState;
        C c10 = new C();
        if (c6627x.f() != null) {
            c10.e(c6627x.f());
        }
        this.contextState = c10;
        this.breadcrumbState = new BreadcrumbState(immutableConfig.getMaxBreadcrumbs(), callbackState, immutableConfig.getLogger());
        this.metadataState = a(c6627x);
        this.featureFlagState = c6627x.f64471a.featureFlagState.b();
    }
}
