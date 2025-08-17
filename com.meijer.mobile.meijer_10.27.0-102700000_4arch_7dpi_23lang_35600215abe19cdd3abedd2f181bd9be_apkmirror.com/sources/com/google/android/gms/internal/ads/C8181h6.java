package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.h6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8181h6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f74600a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74601b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74602c;

    /* renamed from: d, reason: collision with root package name */
    public final List f74603d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f74604e;

    public final int a() {
        int i10 = this.f74602c;
        return i10 != 2 ? i10 != 3 ? 0 : 512 : RecyclerView.m.FLAG_MOVED;
    }

    public C8181h6(int i10, String str, int i11, List list, byte[] bArr) {
        List listUnmodifiableList;
        this.f74600a = i10;
        this.f74601b = str;
        this.f74602c = i11;
        if (list == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.f74603d = listUnmodifiableList;
        this.f74604e = bArr;
    }
}
