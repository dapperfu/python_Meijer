package com.google.crypto.tink.internal;

import Ue.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC11312h;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class G implements K {

    /* renamed from: a, reason: collision with root package name */
    private final String f88163a;

    /* renamed from: b, reason: collision with root package name */
    private final We.a f88164b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC11312h f88165c;

    /* renamed from: d, reason: collision with root package name */
    private final y.c f88166d;

    /* renamed from: e, reason: collision with root package name */
    private final Ue.I f88167e;

    /* renamed from: f, reason: collision with root package name */
    private final Integer f88168f;

    public static G b(String str, AbstractC11312h abstractC11312h, y.c cVar, Ue.I i10, Integer num) throws GeneralSecurityException {
        if (i10 == Ue.I.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new G(str, M.b(str), abstractC11312h, cVar, i10, num);
    }

    @Override // com.google.crypto.tink.internal.K
    public We.a a() {
        return this.f88164b;
    }

    public Integer c() {
        return this.f88168f;
    }

    public y.c d() {
        return this.f88166d;
    }

    public Ue.I e() {
        return this.f88167e;
    }

    public String f() {
        return this.f88163a;
    }

    public AbstractC11312h g() {
        return this.f88165c;
    }

    private G(String str, We.a aVar, AbstractC11312h abstractC11312h, y.c cVar, Ue.I i10, Integer num) {
        this.f88163a = str;
        this.f88164b = aVar;
        this.f88165c = abstractC11312h;
        this.f88166d = cVar;
        this.f88167e = i10;
        this.f88168f = num;
    }
}
