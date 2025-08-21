package com.medallia.digital.mobilesdk;

import java.io.Serializable;

/* loaded from: classes8.dex */
class e3 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f92703a;

    /* renamed from: b, reason: collision with root package name */
    private String f92704b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f92705c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f92706d;

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
        this.f92704b = aVar.toString();
        this.f92703a = cVar != null ? cVar.toString() : null;
        this.f92705c = z10;
    }

    String a() {
        return this.f92704b;
    }

    String b() {
        return this.f92703a;
    }

    boolean c() {
        return this.f92705c;
    }

    boolean d() {
        return this.f92706d;
    }

    public String toString() {
        return "InvitationReason{stickyMode='" + this.f92703a + "', reason='" + this.f92704b + "', actionButtonsEnabled='" + this.f92705c + "', isDeferred='" + this.f92706d + "'}";
    }

    e3(c cVar, b bVar, boolean z10) {
        this.f92704b = bVar.toString();
        this.f92703a = cVar != null ? cVar.toString() : null;
        this.f92705c = z10;
        this.f92706d = true;
    }

    e3(c cVar, boolean z10) {
        this.f92703a = cVar != null ? cVar.toString() : null;
        this.f92705c = z10;
    }
}
