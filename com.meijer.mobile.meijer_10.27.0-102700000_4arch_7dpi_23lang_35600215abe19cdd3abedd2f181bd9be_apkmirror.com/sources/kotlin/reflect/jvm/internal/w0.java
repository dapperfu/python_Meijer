package kotlin.reflect.jvm.internal;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* loaded from: classes13.dex */
class w0 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final KTypeImpl f147222a;

    /* renamed from: b, reason: collision with root package name */
    private final int f147223b;

    /* renamed from: c, reason: collision with root package name */
    private final Lazy f147224c;

    public w0(KTypeImpl kTypeImpl, int i10, Lazy lazy) {
        this.f147222a = kTypeImpl;
        this.f147223b = i10;
        this.f147224c = lazy;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return KTypeImpl.p(this.f147222a, this.f147223b, this.f147224c);
    }
}
