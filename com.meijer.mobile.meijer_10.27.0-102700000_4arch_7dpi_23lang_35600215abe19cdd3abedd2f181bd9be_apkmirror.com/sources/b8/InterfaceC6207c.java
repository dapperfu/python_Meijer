package b8;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lb8/c;", "", "a", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: b8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC6207c {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lb8/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: b8.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60062a = new a("TOUCH", 0);

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ a[] f60063b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f60064c;

        static {
            a[] aVarArrA = a();
            f60063b = aVarArrA;
            f60064c = EnumEntriesKt.a(aVarArrA);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f60062a};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f60063b.clone();
        }

        private a(String str, int i10) {
        }
    }
}
