package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
class o implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final TypeConstructor f147023a;

    /* renamed from: b, reason: collision with root package name */
    private final List f147024b;

    /* renamed from: c, reason: collision with root package name */
    private final TypeAttributes f147025c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f147026d;

    /* renamed from: e, reason: collision with root package name */
    private final MemberScope f147027e;

    public o(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z10, MemberScope memberScope) {
        this.f147023a = typeConstructor;
        this.f147024b = list;
        this.f147025c = typeAttributes;
        this.f147026d = z10;
        this.f147027e = memberScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return KotlinTypeFactory.o(this.f147023a, this.f147024b, this.f147025c, this.f147026d, this.f147027e, (KotlinTypeRefiner) obj);
    }
}
