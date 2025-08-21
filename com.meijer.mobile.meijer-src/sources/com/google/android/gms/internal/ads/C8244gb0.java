package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.gb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8244gb0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f75179b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final List f75180a = new ArrayList();

    public final List a() {
        return this.f75180a;
    }

    public final void b(View view, EnumC7111Na0 enumC7111Na0, String str) {
        C8137fb0 c8137fb0;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f75179b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.f75180a.iterator();
        while (true) {
            if (!it.hasNext()) {
                c8137fb0 = null;
                break;
            } else {
                c8137fb0 = (C8137fb0) it.next();
                if (c8137fb0.b().get() == view) {
                    break;
                }
            }
        }
        if (c8137fb0 == null) {
            this.f75180a.add(new C8137fb0(view, enumC7111Na0, "Ad overlay"));
        }
    }

    public final void c() {
        this.f75180a.clear();
    }
}
