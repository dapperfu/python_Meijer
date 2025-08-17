package g;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0015\u001cB1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001f"}, d2 = {"Lg/g;", "Landroid/os/Parcelable;", "Landroid/content/IntentSender;", "intentSender", "Landroid/content/Intent;", "fillInIntent", "", "flagsMask", "flagsValues", "<init>", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Landroid/content/IntentSender;", "d", "()Landroid/content/IntentSender;", "b", "Landroid/content/Intent;", "()Landroid/content/Intent;", "c", "I", "e", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14151g implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final IntentSender intentSender;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Intent fillInIntent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int flagsMask;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int flagsValues;

    @JvmField
    public static final Parcelable.Creator<C14151g> CREATOR = new b();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lg/g$a;", "", "Landroid/content/IntentSender;", "intentSender", "<init>", "(Landroid/content/IntentSender;)V", "Landroid/content/Intent;", "fillInIntent", "b", "(Landroid/content/Intent;)Lg/g$a;", "", "values", "mask", "c", "(II)Lg/g$a;", "Lg/g;", "a", "()Lg/g;", "Landroid/content/IntentSender;", "Landroid/content/Intent;", "I", "flagsMask", "d", "flagsValues", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final IntentSender intentSender;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Intent fillInIntent;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int flagsMask;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int flagsValues;

        public a(IntentSender intentSender) {
            Intrinsics.j(intentSender, "intentSender");
            this.intentSender = intentSender;
        }

        public final C14151g a() {
            return new C14151g(this.intentSender, this.fillInIntent, this.flagsMask, this.flagsValues);
        }

        public final a b(Intent fillInIntent) {
            this.fillInIntent = fillInIntent;
            return this;
        }

        public final a c(int values, int mask) {
            this.flagsValues = values;
            this.flagsMask = mask;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"g/g$b", "Landroid/os/Parcelable$Creator;", "Lg/g;", "Landroid/os/Parcel;", "inParcel", "a", "(Landroid/os/Parcel;)Lg/g;", "", "size", "", "b", "(I)[Lg/g;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g.g$b */
    public static final class b implements Parcelable.Creator<C14151g> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C14151g createFromParcel(Parcel inParcel) {
            Intrinsics.j(inParcel, "inParcel");
            return new C14151g(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C14151g[] newArray(int size) {
            return new C14151g[size];
        }

        b() {
        }
    }

    public C14151g(IntentSender intentSender, Intent intent, int i10, int i11) {
        Intrinsics.j(intentSender, "intentSender");
        this.intentSender = intentSender;
        this.fillInIntent = intent;
        this.flagsMask = i10;
        this.flagsValues = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: a, reason: from getter */
    public final Intent getFillInIntent() {
        return this.fillInIntent;
    }

    /* renamed from: b, reason: from getter */
    public final int getFlagsMask() {
        return this.flagsMask;
    }

    /* renamed from: c, reason: from getter */
    public final int getFlagsValues() {
        return this.flagsValues;
    }

    /* renamed from: d, reason: from getter */
    public final IntentSender getIntentSender() {
        return this.intentSender;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeParcelable(this.intentSender, flags);
        dest.writeParcelable(this.fillInIntent, flags);
        dest.writeInt(this.flagsMask);
        dest.writeInt(this.flagsValues);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14151g(Parcel parcel) {
        Intrinsics.j(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.g(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
