package com.google.android.gms.common.api;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import jd.InterfaceC14981d;
import jd.InterfaceC14990m;

@Deprecated
/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f65596a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface a extends InterfaceC14981d {
    }

    @Deprecated
    public interface b extends InterfaceC14990m {
    }

    public Looper a() {
        throw new UnsupportedOperationException();
    }
}
