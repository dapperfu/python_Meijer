package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000bJM\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032-\u0010\n\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/room/X;", "Landroidx/room/v;", "R", "Landroidx/room/X$a;", "type", "Lkotlin/Function2;", "Landroidx/room/W;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Landroidx/room/X$a;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface X extends InterfaceC6277v {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/X$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f58660a = new a("DEFERRED", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f58661b = new a("IMMEDIATE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f58662c = new a("EXCLUSIVE", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f58663d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f58664e;

        private static final /* synthetic */ a[] a() {
            return new a[]{f58660a, f58661b, f58662c};
        }

        static {
            a[] aVarArrA = a();
            f58663d = aVarArrA;
            f58664e = EnumEntriesKt.a(aVarArrA);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f58663d.clone();
        }

        private a(String str, int i10) {
        }
    }

    <R> Object a(a aVar, Function2<? super W<R>, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation);

    Object b(Continuation<? super Boolean> continuation);
}
