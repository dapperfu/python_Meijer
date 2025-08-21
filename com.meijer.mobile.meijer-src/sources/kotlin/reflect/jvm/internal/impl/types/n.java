package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes14.dex */
class n implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeConstructor f147926a;

    /* renamed from: b, reason: collision with root package name */
    private final List f147927b;

    /* renamed from: c, reason: collision with root package name */
    private final TypeAttributes f147928c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f147929d;

    public n(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z10) {
        this.f147926a = typeConstructor;
        this.f147927b = list;
        this.f147928c = typeAttributes;
        this.f147929d = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return KotlinTypeFactory.l(this.f147926a, this.f147927b, this.f147928c, this.f147929d, (KotlinTypeRefiner) obj);
    }
}
