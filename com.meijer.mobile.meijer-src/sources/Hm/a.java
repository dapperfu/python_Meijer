package Hm;

import android.os.Parcel;
import android.os.Parcelable;
import com.meijer.mobile.meijer.Y;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0087\u0081\u0002\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B#\b\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0011j\u0002\b\u0018j\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"LHm/a;", "Landroid/os/Parcelable;", "", "", "value", "", "headerResourceId", "messageResourceId", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/String;", "t", "()Ljava/lang/String;", "b", "I", "e", "c", "o", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: e, reason: collision with root package name */
    public static final a f13709e = new a("RESPONSE_CODE_ACCOUNT_ISSUE", 0, "02", Y.f100375D3, Y.f100395E3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f13710f = new a("RESPONSE_CODE_RESTRICTED_CARD", 1, "41", Y.f101074n4, Y.f101094o4);

    /* renamed from: g, reason: collision with root package name */
    public static final a f13711g = new a("RESPONSE_CODE_INVALID_ENTRY", 2, "05", Y.f100795Z3, Y.f100815a4);

    /* renamed from: h, reason: collision with root package name */
    public static final a f13712h = new a("RESPONSE_CODE_INVALID_CARD_NUMBER", 3, "14", Y.f100757X3, Y.f100776Y3);

    /* renamed from: i, reason: collision with root package name */
    public static final a f13713i = new a("RESPONSE_INSUFFICIENT_FUND", 4, "51", Y.f100376D4, Y.f100396E4);

    /* renamed from: j, reason: collision with root package name */
    public static final a f13714j = new a("RESPONSE_EXPIRED_CARD", 5, "54", Y.f100681T3, Y.f100700U3);

    /* renamed from: k, reason: collision with root package name */
    public static final a f13715k = new a("ERROR_CODE_INVALID_PIN", 6, "55", Y.f100975i4, Y.f100994j4);

    /* renamed from: l, reason: collision with root package name */
    public static final a f13716l = new a("ERROR_CODE_PIN_EXCEEDED", 7, "75", Y.f100935g4, Y.f100955h4);

    /* renamed from: m, reason: collision with root package name */
    public static final a f13717m = new a("ERROR_CODE_NETWORK_ERROR", 8, "92", Y.f100835b4, Y.f100855c4);

    /* renamed from: n, reason: collision with root package name */
    public static final a f13718n = new a("EBT_DEFAULT_ERROR", 9, "", Y.f100643R3, Y.f100662S3);

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ a[] f13719o;

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f13720p;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int headerResourceId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int messageResourceId;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LHm/a$a;", "", "<init>", "()V", "", "errorCode", "LHm/a;", "a", "(Ljava/lang/String;)LHm/a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Hm.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0060 A[PHI: r3
          0x0060: PHI (r3v1 java.lang.String) = 
          (r3v0 java.lang.String)
          (r3v0 java.lang.String)
          (r3v2 java.lang.String)
          (r3v2 java.lang.String)
          (r3v2 java.lang.String)
         binds: [B:61:0x00a5, B:45:0x007a, B:35:0x005d, B:32:0x0053, B:26:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final Hm.a a(java.lang.String r6) {
            /*
                r5 = this;
                if (r6 == 0) goto Lb0
                int r0 = r6.hashCode()
                r1 = 1538(0x602, float:2.155E-42)
                java.lang.String r2 = "02"
                if (r0 == r1) goto La8
                r1 = 1571(0x623, float:2.201E-42)
                java.lang.String r3 = "14"
                if (r0 == r1) goto La1
                r1 = 1693(0x69d, float:2.372E-42)
                if (r0 == r1) goto L98
                r1 = 1700(0x6a4, float:2.382E-42)
                if (r0 == r1) goto L8f
                r1 = 1817(0x719, float:2.546E-42)
                java.lang.String r4 = "92"
                if (r0 == r1) goto L86
                r1 = 1821(0x71d, float:2.552E-42)
                if (r0 == r1) goto L7d
                r1 = 1697(0x6a1, float:2.378E-42)
                if (r0 == r1) goto L74
                r1 = 1698(0x6a2, float:2.38E-42)
                if (r0 == r1) goto L6b
                r1 = 1723(0x6bb, float:2.414E-42)
                if (r0 == r1) goto L62
                r1 = 1724(0x6bc, float:2.416E-42)
                java.lang.String r3 = "41"
                if (r0 == r1) goto L57
                switch(r0) {
                    case 1661: goto L4f;
                    case 1662: goto L45;
                    case 1663: goto L3b;
                    default: goto L39;
                }
            L39:
                goto Lb0
            L3b:
                java.lang.String r0 = "43"
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto L60
                goto Lb0
            L45:
                java.lang.String r0 = "42"
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto Laf
                goto Lb0
            L4f:
                boolean r0 = r6.equals(r3)
                if (r0 != 0) goto L60
                goto Lb0
            L57:
                java.lang.String r0 = "62"
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto L60
                goto Lb0
            L60:
                r6 = r3
                goto Lb0
            L62:
                java.lang.String r0 = "61"
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto Laf
                goto Lb0
            L6b:
                java.lang.String r0 = "57"
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto Laf
                goto Lb0
            L74:
                java.lang.String r0 = "56"
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto L60
                goto Lb0
            L7d:
                java.lang.String r0 = "96"
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto L8d
                goto Lb0
            L86:
                boolean r0 = r6.equals(r4)
                if (r0 != 0) goto L8d
                goto Lb0
            L8d:
                r6 = r4
                goto Lb0
            L8f:
                java.lang.String r0 = "59"
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto Laf
                goto Lb0
            L98:
                java.lang.String r0 = "52"
                boolean r0 = r6.equals(r0)
                if (r0 != 0) goto Laf
                goto Lb0
            La1:
                boolean r0 = r6.equals(r3)
                if (r0 != 0) goto L60
                goto Lb0
            La8:
                boolean r0 = r6.equals(r2)
                if (r0 != 0) goto Laf
                goto Lb0
            Laf:
                r6 = r2
            Lb0:
                kotlin.enums.EnumEntries r0 = Hm.a.b()
                java.util.Iterator r0 = r0.iterator()
            Lb8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto Ld0
                java.lang.Object r1 = r0.next()
                r2 = r1
                Hm.a r2 = (Hm.a) r2
                java.lang.String r2 = r2.getValue()
                boolean r2 = kotlin.jvm.internal.Intrinsics.e(r2, r6)
                if (r2 == 0) goto Lb8
                goto Ld1
            Ld0:
                r1 = 0
            Ld1:
                Hm.a r1 = (Hm.a) r1
                if (r1 != 0) goto Ld8
                Hm.a r6 = Hm.a.f13718n
                return r6
            Ld8:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Hm.a.Companion.a(java.lang.String):Hm.a");
        }
    }

    public static EnumEntries<a> b() {
        return f13720p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(name());
    }

    static {
        a[] aVarArrA = a();
        f13719o = aVarArrA;
        f13720p = EnumEntriesKt.a(aVarArrA);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<a>() { // from class: Hm.a.b
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return a.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        };
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f13709e, f13710f, f13711g, f13712h, f13713i, f13714j, f13715k, f13716l, f13717m, f13718n};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f13719o.clone();
    }

    /* renamed from: e, reason: from getter */
    public final int getHeaderResourceId() {
        return this.headerResourceId;
    }

    /* renamed from: o, reason: from getter */
    public final int getMessageResourceId() {
        return this.messageResourceId;
    }

    /* renamed from: t, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    private a(String str, int i10, String str2, int i11, int i12) {
        this.value = str2;
        this.headerResourceId = i11;
        this.messageResourceId = i12;
    }
}
