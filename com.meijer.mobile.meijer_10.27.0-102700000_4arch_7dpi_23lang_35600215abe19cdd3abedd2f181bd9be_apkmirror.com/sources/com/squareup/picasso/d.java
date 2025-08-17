package com.squareup.picasso;

import android.content.Context;
import android.content.UriMatcher;

/* loaded from: classes11.dex */
class d extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final UriMatcher f126503b;

    /* renamed from: a, reason: collision with root package name */
    private final Context f126504a;

    @Override // com.squareup.picasso.r
    public boolean a(q qVar) {
        throw null;
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f126503b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    d(Context context) {
        this.f126504a = context;
    }
}
