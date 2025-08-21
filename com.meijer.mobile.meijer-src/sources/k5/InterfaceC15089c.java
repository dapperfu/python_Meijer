package k5;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import r5.C16846j;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0010\u0005\rJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lk5/c;", "", "Lk5/c$b;", "key", "Lk5/c$c;", "c", "(Lk5/c$b;)Lk5/c$c;", "value", "", "d", "(Lk5/c$b;Lk5/c$c;)V", "", "level", "a", "(I)V", "", "b", "()Ljava/util/Set;", "keys", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: k5.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC15089c {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Lk5/c$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "percent", "b", "(D)Lk5/c$a;", "Lk5/c;", "a", "()Lk5/c;", "Landroid/content/Context;", "D", "maxSizePercent", "", "c", "I", "maxSizeBytes", "", "d", "Z", "strongReferencesEnabled", "e", "weakReferencesEnabled", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: k5.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private double maxSizePercent;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int maxSizeBytes;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean strongReferencesEnabled = true;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean weakReferencesEnabled = true;

        public final InterfaceC15089c a() {
            h c15087a;
            i gVar = this.weakReferencesEnabled ? new g() : new C15088b();
            if (this.strongReferencesEnabled) {
                double d10 = this.maxSizePercent;
                int iC = d10 > 0.0d ? C16846j.c(this.context, d10) : this.maxSizeBytes;
                c15087a = iC > 0 ? new C15092f(iC, gVar) : new C15087a(gVar);
            } else {
                c15087a = new C15087a(gVar);
            }
            return new C15091e(c15087a, gVar);
        }

        public final a b(double percent) {
            if (0.0d > percent || percent > 1.0d) {
                throw new IllegalArgumentException("size must be in the range [0.0, 1.0].");
            }
            this.maxSizeBytes = 0;
            this.maxSizePercent = percent;
            return this;
        }

        public a(Context context) {
            this.context = context;
            this.maxSizePercent = C16846j.e(context);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001dB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lk5/c$b;", "Landroid/os/Parcelable;", "", "key", "", "extras", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "(Ljava/lang/String;Ljava/util/Map;)Lk5/c$b;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "d", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: k5.c$b, reason: from toString */
    public static final class Key implements Parcelable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String key;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, String> extras;

        /* renamed from: c, reason: collision with root package name */
        private static final C2241b f141597c = new C2241b(null);

        @JvmField
        @Deprecated
        public static final Parcelable.Creator<Key> CREATOR = new a();

        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"k5/c$b$a", "Landroid/os/Parcelable$Creator;", "Lk5/c$b;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lk5/c$b;", "", "size", "", "b", "(I)[Lk5/c$b;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: k5.c$b$a */
        public static final class a implements Parcelable.Creator<Key> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Key[] newArray(int size) {
                return new Key[size];
            }

            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Key createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                Intrinsics.g(string);
                int i10 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
                for (int i11 = 0; i11 < i10; i11++) {
                    String string2 = parcel.readString();
                    Intrinsics.g(string2);
                    String string3 = parcel.readString();
                    Intrinsics.g(string3);
                    linkedHashMap.put(string2, string3);
                }
                return new Key(string, linkedHashMap);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lk5/c$b$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lk5/c$b;", "CREATOR", "Landroid/os/Parcelable$Creator;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: k5.c$b$b, reason: collision with other inner class name */
        private static final class C2241b {
            public /* synthetic */ C2241b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C2241b() {
            }
        }

        public Key(String str, Map<String, String> map) {
            this.key = str;
            this.extras = map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.e(this.key, key.key) && Intrinsics.e(this.extras, key.extras);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Key b(Key key, String str, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = key.key;
            }
            if ((i10 & 2) != 0) {
                map = key.extras;
            }
            return key.a(str, map);
        }

        public final Key a(String key, Map<String, String> extras) {
            return new Key(key, extras);
        }

        public final Map<String, String> c() {
            return this.extras;
        }

        /* renamed from: d, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.extras.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.key + ", extras=" + this.extras + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            parcel.writeString(this.key);
            parcel.writeInt(this.extras.size());
            for (Map.Entry<String, String> entry : this.extras.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                parcel.writeString(key);
                parcel.writeString(value);
            }
        }

        public /* synthetic */ Key(String str, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? MapsKt.k() : map);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lk5/c$c;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "", "extras", "<init>", "(Landroid/graphics/Bitmap;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: k5.c$c, reason: collision with other inner class name and from toString */
    public static final class Value {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap bitmap;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, Object> extras;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return Intrinsics.e(this.bitmap, value.bitmap) && Intrinsics.e(this.extras, value.extras);
        }

        /* renamed from: a, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final Map<String, Object> b() {
            return this.extras;
        }

        public int hashCode() {
            return (this.bitmap.hashCode() * 31) + this.extras.hashCode();
        }

        public String toString() {
            return "Value(bitmap=" + this.bitmap + ", extras=" + this.extras + ')';
        }

        public Value(Bitmap bitmap, Map<String, ? extends Object> map) {
            this.bitmap = bitmap;
            this.extras = map;
        }
    }

    void a(int level);

    Set<Key> b();

    Value c(Key key);

    void d(Key key, Value value);
}
