package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import id.C14720c;
import id.C14723f;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import jd.InterfaceC14981d;
import jd.InterfaceC14990m;

/* renamed from: com.google.android.gms.common.internal.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6651h<T extends IInterface> extends AbstractC6646c<T> implements a.f {
    private static volatile Executor zaa;
    private final C6648e zab;
    private final Set zac;
    private final Account zad;

    protected AbstractC6651h(Context context, Handler handler, int i10, C6648e c6648e) {
        super(context, handler, AbstractC6652i.b(context), C14723f.m(), i10, null, null);
        this.zab = (C6648e) r.l(c6648e);
        this.zad = c6648e.a();
        this.zac = zaa(c6648e.c());
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
    protected Executor getBindServiceExecutor() {
        return null;
    }

    protected final C6648e getClientSettings() {
        return this.zab;
    }

    public C14720c[] getRequiredFeatures() {
        return new C14720c[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c
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

    protected AbstractC6651h(Context context, Looper looper, int i10, C6648e c6648e) {
        this(context, looper, AbstractC6652i.b(context), C14723f.m(), i10, c6648e, null, null);
    }

    @Deprecated
    protected AbstractC6651h(Context context, Looper looper, int i10, C6648e c6648e, e.a aVar, e.b bVar) {
        this(context, looper, i10, c6648e, (InterfaceC14981d) aVar, (InterfaceC14990m) bVar);
    }

    protected AbstractC6651h(Context context, Looper looper, int i10, C6648e c6648e, InterfaceC14981d interfaceC14981d, InterfaceC14990m interfaceC14990m) {
        this(context, looper, AbstractC6652i.b(context), C14723f.m(), i10, c6648e, (InterfaceC14981d) r.l(interfaceC14981d), (InterfaceC14990m) r.l(interfaceC14990m));
    }

    protected AbstractC6651h(Context context, Looper looper, AbstractC6652i abstractC6652i, C14723f c14723f, int i10, C6648e c6648e, InterfaceC14981d interfaceC14981d, InterfaceC14990m interfaceC14990m) {
        super(context, looper, abstractC6652i, c14723f, i10, interfaceC14981d == null ? null : new I(interfaceC14981d), interfaceC14990m != null ? new J(interfaceC14990m) : null, c6648e.h());
        this.zab = c6648e;
        this.zad = c6648e.a();
        this.zac = zaa(c6648e.c());
    }
}
