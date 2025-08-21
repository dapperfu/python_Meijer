package com.google.android.gms.common.internal;

import Z.C5604b;
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
public final class C6648e {

    /* renamed from: a, reason: collision with root package name */
    private final Account f65679a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f65680b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f65681c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f65682d;

    /* renamed from: e, reason: collision with root package name */
    private final int f65683e;

    /* renamed from: f, reason: collision with root package name */
    private final View f65684f;

    /* renamed from: g, reason: collision with root package name */
    private final String f65685g;

    /* renamed from: h, reason: collision with root package name */
    private final String f65686h;

    /* renamed from: i, reason: collision with root package name */
    private final Sd.a f65687i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f65688j;

    /* renamed from: com.google.android.gms.common.internal.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f65689a;

        /* renamed from: b, reason: collision with root package name */
        private C5604b f65690b;

        /* renamed from: c, reason: collision with root package name */
        private String f65691c;

        /* renamed from: d, reason: collision with root package name */
        private String f65692d;

        /* renamed from: e, reason: collision with root package name */
        private final Sd.a f65693e = Sd.a.f34528k;

        public a b(String str) {
            this.f65691c = str;
            return this;
        }

        public final a d(Account account) {
            this.f65689a = account;
            return this;
        }

        public final a e(String str) {
            this.f65692d = str;
            return this;
        }

        public C6648e a() {
            return new C6648e(this.f65689a, this.f65690b, null, 0, null, this.f65691c, this.f65692d, this.f65693e, false);
        }

        public final a c(Collection collection) {
            if (this.f65690b == null) {
                this.f65690b = new C5604b();
            }
            this.f65690b.addAll(collection);
            return this;
        }
    }

    public Account a() {
        return this.f65679a;
    }

    public Set<Scope> c() {
        return this.f65681c;
    }

    public String d() {
        return this.f65685g;
    }

    public Set<Scope> e() {
        return this.f65680b;
    }

    public final Integer g() {
        return this.f65688j;
    }

    public final String h() {
        return this.f65686h;
    }

    public final void i(Integer num) {
        this.f65688j = num;
    }

    public Account b() {
        Account account = this.f65679a;
        return account != null ? account : new Account(AbstractC6646c.DEFAULT_ACCOUNT, "com.google");
    }

    public final Sd.a f() {
        return this.f65687i;
    }

    public C6648e(Account account, Set set, Map map, int i10, View view, String str, String str2, Sd.a aVar, boolean z10) {
        Set setUnmodifiableSet;
        this.f65679a = account;
        if (set == null) {
            setUnmodifiableSet = Collections.EMPTY_SET;
        } else {
            setUnmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.f65680b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f65682d = map;
        this.f65684f = view;
        this.f65683e = i10;
        this.f65685g = str;
        this.f65686h = str2;
        this.f65687i = aVar == null ? Sd.a.f34528k : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((D) it.next()).f65641a);
        }
        this.f65681c = Collections.unmodifiableSet(hashSet);
    }
}
