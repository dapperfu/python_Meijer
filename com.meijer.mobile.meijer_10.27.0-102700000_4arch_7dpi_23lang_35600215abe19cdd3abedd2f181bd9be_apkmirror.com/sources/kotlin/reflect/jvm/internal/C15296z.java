package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KClassImpl;

/* renamed from: kotlin.reflect.jvm.internal.z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class C15296z implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KClassImpl.Data f147229a;

    public C15296z(KClassImpl.Data data) {
        this.f147229a = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KClassImpl.Data.z(this.f147229a);
    }
}
