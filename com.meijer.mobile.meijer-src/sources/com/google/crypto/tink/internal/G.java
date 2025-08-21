package com.google.crypto.tink.internal;

import We.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC11437h;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class G implements K {

    /* renamed from: a, reason: collision with root package name */
    private final String f89003a;

    /* renamed from: b, reason: collision with root package name */
    private final Ye.a f89004b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC11437h f89005c;

    /* renamed from: d, reason: collision with root package name */
    private final y.c f89006d;

    /* renamed from: e, reason: collision with root package name */
    private final We.I f89007e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f89008f;

    public static G b(String str, AbstractC11437h abstractC11437h, y.c cVar, We.I i10, Integer num) throws GeneralSecurityException {
        if (i10 == We.I.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new G(str, M.b(str), abstractC11437h, cVar, i10, num);
    }

    @Override // com.google.crypto.tink.internal.K
    public Ye.a a() {
        return this.f89004b;
    }

    public Integer c() {
        return this.f89008f;
    }

    public y.c d() {
        return this.f89006d;
    }

    public We.I e() {
        return this.f89007e;
    }

    public String f() {
        return this.f89003a;
    }

    public AbstractC11437h g() {
        return this.f89005c;
    }

    private G(String str, Ye.a aVar, AbstractC11437h abstractC11437h, y.c cVar, We.I i10, Integer num) {
        this.f89003a = str;
        this.f89004b = aVar;
        this.f89005c = abstractC11437h;
        this.f89006d = cVar;
        this.f89007e = i10;
        this.f89008f = num;
    }
}
