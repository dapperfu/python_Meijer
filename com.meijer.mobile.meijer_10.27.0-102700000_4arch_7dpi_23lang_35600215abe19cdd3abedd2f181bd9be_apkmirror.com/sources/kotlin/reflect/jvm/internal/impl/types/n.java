package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
class n implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeConstructor f147019a;

    /* renamed from: b, reason: collision with root package name */
    private final List f147020b;

    /* renamed from: c, reason: collision with root package name */
    private final TypeAttributes f147021c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f147022d;

    public n(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z10) {
        this.f147019a = typeConstructor;
        this.f147020b = list;
        this.f147021c = typeAttributes;
        this.f147022d = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return KotlinTypeFactory.l(this.f147019a, this.f147020b, this.f147021c, this.f147022d, (KotlinTypeRefiner) obj);
    }
}
