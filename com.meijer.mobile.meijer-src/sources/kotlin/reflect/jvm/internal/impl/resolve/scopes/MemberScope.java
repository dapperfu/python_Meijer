package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
public interface MemberScope extends ResolutionScope {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f147197a = Companion.f147198a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f147198a = new Companion();

        /* renamed from: b, reason: collision with root package name */
        private static final Function1<Name, Boolean> f147199b = c.f147216a;

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean a(Name it) {
            Intrinsics.j(it, "it");
            return true;
        }

        public final Function1<Name, Boolean> c() {
            return f147199b;
        }

        private Companion() {
        }
    }

    public static final class DefaultImpls {
    }

    Set<Name> a();

    Collection<? extends SimpleFunctionDescriptor> b(Name name, LookupLocation lookupLocation);

    Collection<? extends PropertyDescriptor> c(Name name, LookupLocation lookupLocation);

    Set<Name> d();

    Set<Name> e();

    public static final class Empty extends MemberScopeImpl {

        /* renamed from: b, reason: collision with root package name */
        public static final Empty f147200b = new Empty();

        private Empty() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> a() {
            return SetsKt.e();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> d() {
            return SetsKt.e();
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> e() {
            return SetsKt.e();
        }
    }
}
