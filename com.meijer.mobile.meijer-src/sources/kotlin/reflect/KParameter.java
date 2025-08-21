package kotlin.reflect;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0001\u001aR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KAnnotatedElement;", "", "getIndex", "()I", "index", "", "getName", "()Ljava/lang/String;", "name", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/KParameter$Kind;", "f", "()Lkotlin/reflect/KParameter$Kind;", "kind", "", "l", "()Z", "isOptional", "b", "isVararg$annotations", "()V", "isVararg", "Kind", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface KParameter extends KAnnotatedElement {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/KParameter$Kind;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Kind {

        /* renamed from: a, reason: collision with root package name */
        public static final Kind f143849a = new Kind("INSTANCE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final Kind f143850b = new Kind("EXTENSION_RECEIVER", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final Kind f143851c = new Kind("VALUE", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ Kind[] f143852d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f143853e;

        private static final /* synthetic */ Kind[] a() {
            return new Kind[]{f143849a, f143850b, f143851c};
        }

        static {
            Kind[] kindArrA = a();
            f143852d = kindArrA;
            f143853e = EnumEntriesKt.a(kindArrA);
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f143852d.clone();
        }

        private Kind(String str, int i10) {
        }
    }

    boolean b();

    Kind f();

    int getIndex();

    String getName();

    KType getType();

    boolean l();
}
