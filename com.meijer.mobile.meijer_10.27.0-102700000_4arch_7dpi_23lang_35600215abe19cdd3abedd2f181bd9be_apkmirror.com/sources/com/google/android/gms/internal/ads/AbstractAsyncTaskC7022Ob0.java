package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ob0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractAsyncTaskC7022Ob0 extends AbstractAsyncTaskC7056Pb0 {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet f69121c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f69122d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f69123e;

    public AbstractAsyncTaskC7022Ob0(C6785Hb0 c6785Hb0, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(c6785Hb0);
        this.f69121c = new HashSet(hashSet);
        this.f69122d = jSONObject;
        this.f69123e = j10;
    }
}
