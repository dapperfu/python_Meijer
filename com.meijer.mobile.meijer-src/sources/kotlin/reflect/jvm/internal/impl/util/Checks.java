package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.CheckResult;
import kotlin.text.Regex;

/* loaded from: classes14.dex */
public final class Checks {

    /* renamed from: a, reason: collision with root package name */
    private final Name f147966a;

    /* renamed from: b, reason: collision with root package name */
    private final Regex f147967b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection<Name> f147968c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1<FunctionDescriptor, String> f147969d;

    /* renamed from: e, reason: collision with root package name */
    private final Check[] f147970e;

    static final class a implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f147971a = new a();

        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FunctionDescriptor functionDescriptor) {
            Intrinsics.j(functionDescriptor, "<this>");
            return null;
        }
    }

    static final class b implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f147972a = new b();

        b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FunctionDescriptor functionDescriptor) {
            Intrinsics.j(functionDescriptor, "<this>");
            return null;
        }
    }

    static final class c implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f147973a = new c();

        c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(FunctionDescriptor functionDescriptor) {
            Intrinsics.j(functionDescriptor, "<this>");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Checks(Name name, Regex regex, Collection<Name> collection, Function1<? super FunctionDescriptor, String> function1, Check... checkArr) {
        this.f147966a = name;
        this.f147967b = regex;
        this.f147968c = collection;
        this.f147969d = function1;
        this.f147970e = checkArr;
    }

    public final CheckResult a(FunctionDescriptor functionDescriptor) {
        Intrinsics.j(functionDescriptor, "functionDescriptor");
        for (Check check : this.f147970e) {
            String strA = check.a(functionDescriptor);
            if (strA != null) {
                return new CheckResult.IllegalSignature(strA);
            }
        }
        String strInvoke = this.f147969d.invoke(functionDescriptor);
        return strInvoke != null ? new CheckResult.IllegalSignature(strInvoke) : CheckResult.SuccessCheck.f147965b;
    }

    public final boolean b(FunctionDescriptor functionDescriptor) {
        Intrinsics.j(functionDescriptor, "functionDescriptor");
        if (this.f147966a != null && !Intrinsics.e(functionDescriptor.getName(), this.f147966a)) {
            return false;
        }
        if (this.f147967b != null) {
            String strB = functionDescriptor.getName().b();
            Intrinsics.i(strB, "asString(...)");
            if (!this.f147967b.j(strB)) {
                return false;
            }
        }
        Collection<Name> collection = this.f147968c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ Checks(Name name, Check[] checkArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(name, checkArr, (Function1<? super FunctionDescriptor, String>) ((i10 & 4) != 0 ? a.f147971a : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Name name, Check[] checks, Function1<? super FunctionDescriptor, String> additionalChecks) {
        this(name, (Regex) null, (Collection<Name>) null, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.j(name, "name");
        Intrinsics.j(checks, "checks");
        Intrinsics.j(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(Regex regex, Check[] checkArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, checkArr, (Function1<? super FunctionDescriptor, String>) ((i10 & 4) != 0 ? b.f147972a : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Regex regex, Check[] checks, Function1<? super FunctionDescriptor, String> additionalChecks) {
        this((Name) null, regex, (Collection<Name>) null, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.j(regex, "regex");
        Intrinsics.j(checks, "checks");
        Intrinsics.j(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ Checks(Collection collection, Check[] checkArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((Collection<Name>) collection, checkArr, (Function1<? super FunctionDescriptor, String>) ((i10 & 4) != 0 ? c.f147973a : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Collection<Name> nameList, Check[] checks, Function1<? super FunctionDescriptor, String> additionalChecks) {
        this((Name) null, (Regex) null, nameList, additionalChecks, (Check[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.j(nameList, "nameList");
        Intrinsics.j(checks, "checks");
        Intrinsics.j(additionalChecks, "additionalChecks");
    }
}
