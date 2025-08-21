package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002)*BA\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0015\u0010\u001eR\u001e\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0016\u0010%\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010$R\u0014\u0010(\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "Ljava/lang/Class;", "jClass", "", "", "parameterNames", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "callMode", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "origin", "Ljava/lang/reflect/Method;", "methods", "<init>", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Class;", "b", "Ljava/util/List;", "c", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "d", "Ljava/lang/reflect/Type;", "e", "()Ljava/util/List;", "parameterTypes", "f", "erasedParameterTypes", "g", "defaultValues", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "CallMode", "Origin", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class AnnotationConstructorCaller implements Caller {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> jClass;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> parameterNames;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CallMode callMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Method> methods;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<Type> parameterTypes;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<Class<?>> erasedParameterTypes;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Object> defaultValues;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CallMode {

        /* renamed from: a, reason: collision with root package name */
        public static final CallMode f144070a = new CallMode("CALL_BY_NAME", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final CallMode f144071b = new CallMode("POSITIONAL_CALL", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ CallMode[] f144072c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f144073d;

        private static final /* synthetic */ CallMode[] a() {
            return new CallMode[]{f144070a, f144071b};
        }

        static {
            CallMode[] callModeArrA = a();
            f144072c = callModeArrA;
            f144073d = EnumEntriesKt.a(callModeArrA);
        }

        public static CallMode valueOf(String str) {
            return (CallMode) Enum.valueOf(CallMode.class, str);
        }

        public static CallMode[] values() {
            return (CallMode[]) f144072c.clone();
        }

        private CallMode(String str, int i10) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Origin {

        /* renamed from: a, reason: collision with root package name */
        public static final Origin f144074a = new Origin("JAVA", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final Origin f144075b = new Origin("KOTLIN", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ Origin[] f144076c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f144077d;

        private static final /* synthetic */ Origin[] a() {
            return new Origin[]{f144074a, f144075b};
        }

        static {
            Origin[] originArrA = a();
            f144076c = originArrA;
            f144077d = EnumEntriesKt.a(originArrA);
        }

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) f144076c.clone();
        }

        private Origin(String str, int i10) {
        }
    }

    public AnnotationConstructorCaller(Class<?> jClass, List<String> parameterNames, CallMode callMode, Origin origin, List<Method> methods) {
        Intrinsics.j(jClass, "jClass");
        Intrinsics.j(parameterNames, "parameterNames");
        Intrinsics.j(callMode, "callMode");
        Intrinsics.j(origin, "origin");
        Intrinsics.j(methods, "methods");
        this.jClass = jClass;
        this.parameterNames = parameterNames;
        this.callMode = callMode;
        this.methods = methods;
        List<Method> list = methods;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.parameterTypes = arrayList;
        List<Method> list2 = this.methods;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            Intrinsics.g(returnType);
            Class<?> clsK = ReflectClassUtilKt.k(returnType);
            if (clsK != null) {
                returnType = clsK;
            }
            arrayList2.add(returnType);
        }
        this.erasedParameterTypes = arrayList2;
        List<Method> list3 = this.methods;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.x(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.defaultValues = arrayList3;
        if (this.callMode == CallMode.f144071b && origin == Origin.f144074a && !CollectionsKt.M0(this.parameterNames, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    public Void e() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public List<Type> a() {
        return this.parameterTypes;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public Object call(Object[] args) {
        Intrinsics.j(args, "args");
        d(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object obj = args[i10];
            int i12 = i11 + 1;
            Object objQ = (obj == null && this.callMode == CallMode.f144070a) ? this.defaultValues.get(i11) : AnnotationConstructorCallerKt.q(obj, this.erasedParameterTypes.get(i11));
            if (objQ == null) {
                AnnotationConstructorCallerKt.p(i11, this.parameterNames.get(i11), this.erasedParameterTypes.get(i11));
                throw new KotlinNothingValueException();
            }
            arrayList.add(objQ);
            i10++;
            i11 = i12;
        }
        return AnnotationConstructorCallerKt.g(this.jClass, MapsKt.y(CollectionsKt.u1(this.parameterNames, arrayList)), this.methods);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public Type getReturnType() {
        return this.jClass;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) e();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public boolean c() {
        return Caller.DefaultImpls.b(this);
    }

    public void d(Object[] objArr) {
        Caller.DefaultImpls.a(this, objArr);
    }

    public /* synthetic */ AnnotationConstructorCaller(Class cls, List list, CallMode callMode, Origin origin, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        List list3;
        if ((i10 & 16) != 0) {
            List list4 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list3 = arrayList;
        } else {
            list3 = list2;
        }
        this(cls, list, callMode, origin, list3);
    }
}
