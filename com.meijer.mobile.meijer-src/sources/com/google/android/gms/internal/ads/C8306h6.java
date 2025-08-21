package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.h6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8306h6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f75440a;

    /* renamed from: b, reason: collision with root package name */
    public final String f75441b;

    /* renamed from: c, reason: collision with root package name */
    public final int f75442c;

    /* renamed from: d, reason: collision with root package name */
    public final List f75443d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f75444e;

    public final int a() {
        int i10 = this.f75442c;
        return i10 != 2 ? i10 != 3 ? 0 : 512 : RecyclerView.m.FLAG_MOVED;
    }

    public C8306h6(int i10, String str, int i11, List list, byte[] bArr) {
        List listUnmodifiableList;
        this.f75440a = i10;
        this.f75441b = str;
        this.f75442c = i11;
        if (list == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.f75443d = listUnmodifiableList;
        this.f75444e = bArr;
    }
}
