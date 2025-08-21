package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ob0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC7147Ob0 extends AbstractAsyncTaskC7181Pb0 {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet f69961c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f69962d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f69963e;

    public AbstractAsyncTaskC7147Ob0(C6910Hb0 c6910Hb0, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(c6910Hb0);
        this.f69961c = new HashSet(hashSet);
        this.f69962d = jSONObject;
        this.f69963e = j10;
    }
}
