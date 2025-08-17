package com.medallia.digital.mobilesdk;

import java.io.Serializable;

/* loaded from: classes7.dex */
class e3 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f91864a;

    /* renamed from: b, reason: collision with root package name */
    private String f91865b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f91866c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f91867d;

    enum a {
        swipeUp,
        swipeDown,
        swipeLeft,
        swipeRight,
        buttonClicked
    }

    enum b {
        maybeLater,
        androidBackButton,
        timeoutPassed,
        refreshSession,
        disableIntercept,
        stopApi,
        showForm,
        handleNotification,
        closed
    }

    enum c {
        No,
        StickyByConfiguration,
        StickyByGesture
    }

    e3(c cVar, a aVar, boolean z10) {
        this.f91865b = aVar.toString();
        this.f91864a = cVar != null ? cVar.toString() : null;
        this.f91866c = z10;
    }

    String a() {
        return this.f91865b;
    }

    String b() {
        return this.f91864a;
    }

    boolean c() {
        return this.f91866c;
    }

    boolean d() {
        return this.f91867d;
    }

    public String toString() {
        return "InvitationReason{stickyMode='" + this.f91864a + "', reason='" + this.f91865b + "', actionButtonsEnabled='" + this.f91866c + "', isDeferred='" + this.f91867d + "'}";
    }

    e3(c cVar, b bVar, boolean z10) {
        this.f91865b = bVar.toString();
        this.f91864a = cVar != null ? cVar.toString() : null;
        this.f91866c = z10;
        this.f91867d = true;
    }

    e3(c cVar, boolean z10) {
        this.f91864a = cVar != null ? cVar.toString() : null;
        this.f91866c = z10;
    }
}
