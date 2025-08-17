package com.google.android.gms.common.internal;

import Z.C5504b;
import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6523e {

    /* renamed from: a, reason: collision with root package name */
    private final Account f64839a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f64840b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f64841c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f64842d;

    /* renamed from: e, reason: collision with root package name */
    private final int f64843e;

    /* renamed from: f, reason: collision with root package name */
    private final View f64844f;

    /* renamed from: g, reason: collision with root package name */
    private final String f64845g;

    /* renamed from: h, reason: collision with root package name */
    private final String f64846h;

    /* renamed from: i, reason: collision with root package name */
    private final Qd.a f64847i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f64848j;

    /* renamed from: com.google.android.gms.common.internal.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f64849a;

        /* renamed from: b, reason: collision with root package name */
        private C5504b f64850b;

        /* renamed from: c, reason: collision with root package name */
        private String f64851c;

        /* renamed from: d, reason: collision with root package name */
        private String f64852d;

        /* renamed from: e, reason: collision with root package name */
        private final Qd.a f64853e = Qd.a.f29978k;

        public a b(String str) {
            this.f64851c = str;
            return this;
        }

        public final a d(Account account) {
            this.f64849a = account;
            return this;
        }

        public final a e(String str) {
            this.f64852d = str;
            return this;
        }

        public C6523e a() {
            return new C6523e(this.f64849a, this.f64850b, null, 0, null, this.f64851c, this.f64852d, this.f64853e, false);
        }

        public final a c(Collection collection) {
            if (this.f64850b == null) {
                this.f64850b = new C5504b();
            }
            this.f64850b.addAll(collection);
            return this;
        }
    }

    public Account a() {
        return this.f64839a;
    }

    public Set<Scope> c() {
        return this.f64841c;
    }

    public String d() {
        return this.f64845g;
    }

    public Set<Scope> e() {
        return this.f64840b;
    }

    public final Integer g() {
        return this.f64848j;
    }

    public final String h() {
        return this.f64846h;
    }

    public final void i(Integer num) {
        this.f64848j = num;
    }

    public Account b() {
        Account account = this.f64839a;
        return account != null ? account : new Account(AbstractC6521c.DEFAULT_ACCOUNT, "com.google");
    }

    public final Qd.a f() {
        return this.f64847i;
    }

    public C6523e(Account account, Set set, Map map, int i10, View view, String str, String str2, Qd.a aVar, boolean z10) {
        Set setUnmodifiableSet;
        this.f64839a = account;
        if (set == null) {
            setUnmodifiableSet = Collections.EMPTY_SET;
        } else {
            setUnmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.f64840b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f64842d = map;
        this.f64844f = view;
        this.f64843e = i10;
        this.f64845g = str;
        this.f64846h = str2;
        this.f64847i = aVar == null ? Qd.a.f29978k : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((D) it.next()).f64801a);
        }
        this.f64841c = Collections.unmodifiableSet(hashSet);
    }
}
