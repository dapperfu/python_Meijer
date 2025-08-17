package com.bugsnag.android;

import Q6.ImmutableConfig;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010$\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010)\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/bugsnag/android/n;", "LR6/c;", "LQ6/f;", "cfg", "Lcom/bugsnag/android/u;", "configuration", "<init>", "(LQ6/f;Lcom/bugsnag/android/u;)V", "Lcom/bugsnag/android/y0;", "d", "(Lcom/bugsnag/android/u;)Lcom/bugsnag/android/y0;", "Lcom/bugsnag/android/r;", "b", "Lcom/bugsnag/android/r;", "g", "()Lcom/bugsnag/android/r;", "clientObservable", "Lcom/bugsnag/android/o;", "c", "Lcom/bugsnag/android/o;", "f", "()Lcom/bugsnag/android/o;", "callbackState", "Lcom/bugsnag/android/z;", "Lcom/bugsnag/android/z;", "h", "()Lcom/bugsnag/android/z;", "contextState", "Lcom/bugsnag/android/BreadcrumbState;", "e", "Lcom/bugsnag/android/BreadcrumbState;", "()Lcom/bugsnag/android/BreadcrumbState;", "breadcrumbState", "Lcom/bugsnag/android/y0;", "j", "()Lcom/bugsnag/android/y0;", "metadataState", "Lcom/bugsnag/android/d0;", "Lcom/bugsnag/android/d0;", "i", "()Lcom/bugsnag/android/d0;", "featureFlagState", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6483n extends R6.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r clientObservable = new r();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CallbackState callbackState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C6506z contextState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final BreadcrumbState breadcrumbState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final MetadataState metadataState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final FeatureFlagState featureFlagState;

    private final MetadataState d(C6496u configuration) {
        return configuration.f63612a.metadataState.e(configuration.f63612a.metadataState.getMetadata().e());
    }

    /* renamed from: e, reason: from getter */
    public final BreadcrumbState getBreadcrumbState() {
        return this.breadcrumbState;
    }

    /* renamed from: f, reason: from getter */
    public final CallbackState getCallbackState() {
        return this.callbackState;
    }

    /* renamed from: g, reason: from getter */
    public final r getClientObservable() {
        return this.clientObservable;
    }

    /* renamed from: h, reason: from getter */
    public final C6506z getContextState() {
        return this.contextState;
    }

    /* renamed from: i, reason: from getter */
    public final FeatureFlagState getFeatureFlagState() {
        return this.featureFlagState;
    }

    /* renamed from: j, reason: from getter */
    public final MetadataState getMetadataState() {
        return this.metadataState;
    }

    public C6483n(ImmutableConfig immutableConfig, C6496u c6496u) {
        CallbackState callbackState = c6496u.f63612a.callbackState;
        this.callbackState = callbackState;
        C6506z c6506z = new C6506z();
        if (c6496u.f() != null) {
            c6506z.d(c6496u.f());
        }
        Unit unit = Unit.f142422a;
        this.contextState = c6506z;
        this.breadcrumbState = new BreadcrumbState(immutableConfig.getMaxBreadcrumbs(), callbackState, immutableConfig.getLogger());
        this.metadataState = d(c6496u);
        this.featureFlagState = c6496u.f63612a.featureFlagState.a();
    }
}
