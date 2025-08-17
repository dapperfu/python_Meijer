package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.gb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8119gb0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f74339b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final List f74340a = new ArrayList();

    public final List a() {
        return this.f74340a;
    }

    public final void b(View view, EnumC6986Na0 enumC6986Na0, String str) {
        C8012fb0 c8012fb0;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f74339b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.f74340a.iterator();
        while (true) {
            if (!it.hasNext()) {
                c8012fb0 = null;
                break;
            } else {
                c8012fb0 = (C8012fb0) it.next();
                if (c8012fb0.b().get() == view) {
                    break;
                }
            }
        }
        if (c8012fb0 == null) {
            this.f74340a.add(new C8012fb0(view, enumC6986Na0, "Ad overlay"));
        }
    }

    public final void c() {
        this.f74340a.clear();
    }
}
