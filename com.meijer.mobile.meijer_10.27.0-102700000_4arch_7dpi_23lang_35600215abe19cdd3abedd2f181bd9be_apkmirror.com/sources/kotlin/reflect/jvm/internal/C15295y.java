package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* renamed from: kotlin.reflect.jvm.internal.y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15295y implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl.Data f147227a;

    public C15295y(KClassImpl.Data data) {
        this.f147227a = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.y(this.f147227a);
    }
}
