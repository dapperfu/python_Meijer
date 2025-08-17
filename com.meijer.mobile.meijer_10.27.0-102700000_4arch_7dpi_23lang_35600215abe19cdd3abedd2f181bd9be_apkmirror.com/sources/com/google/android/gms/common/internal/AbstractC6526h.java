package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import gd.C14244c;
import gd.C14247f;
import hd.InterfaceC14403d;
import hd.InterfaceC14412m;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6526h<T extends IInterface> extends AbstractC6521c<T> implements a.f {
    private static volatile Executor zaa;
    private final C6523e zab;
    private final Set zac;
    private final Account zad;

    protected AbstractC6526h(Context context, Handler handler, int i10, C6523e c6523e) {
        super(context, handler, AbstractC6527i.b(context), C14247f.m(), i10, null, null);
        this.zab = (C6523e) r.l(c6523e);
        this.zad = c6523e.a();
        this.zac = zaa(c6523e.c());
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected Executor getBindServiceExecutor() {
        return null;
    }

    protected final C6523e getClientSettings() {
        return this.zab;
    }

    public C14244c[] getRequiredFeatures() {
        return new C14244c[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final Set<Scope> getScopes() {
        return this.zac;
    }

    protected Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }

    private final Set zaa(Set set) {
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setValidateScopes;
    }

    @Override // com.google.android.gms.common.api.a.f
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        if (requiresSignIn()) {
            return this.zac;
        }
        return Collections.EMPTY_SET;
    }

    protected AbstractC6526h(Context context, Looper looper, int i10, C6523e c6523e) {
        this(context, looper, AbstractC6527i.b(context), C14247f.m(), i10, c6523e, null, null);
    }

    @Deprecated
    protected AbstractC6526h(Context context, Looper looper, int i10, C6523e c6523e, e.a aVar, e.b bVar) {
        this(context, looper, i10, c6523e, (InterfaceC14403d) aVar, (InterfaceC14412m) bVar);
    }

    protected AbstractC6526h(Context context, Looper looper, int i10, C6523e c6523e, InterfaceC14403d interfaceC14403d, InterfaceC14412m interfaceC14412m) {
        this(context, looper, AbstractC6527i.b(context), C14247f.m(), i10, c6523e, (InterfaceC14403d) r.l(interfaceC14403d), (InterfaceC14412m) r.l(interfaceC14412m));
    }

    protected AbstractC6526h(Context context, Looper looper, AbstractC6527i abstractC6527i, C14247f c14247f, int i10, C6523e c6523e, InterfaceC14403d interfaceC14403d, InterfaceC14412m interfaceC14412m) {
        super(context, looper, abstractC6527i, c14247f, i10, interfaceC14403d == null ? null : new I(interfaceC14403d), interfaceC14412m != null ? new J(interfaceC14412m) : null, c6523e.h());
        this.zab = c6523e;
        this.zad = c6523e.a();
        this.zac = zaa(c6523e.c());
    }
}
