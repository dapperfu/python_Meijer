package ak;

import android.content.Context;
import android.content.res.Resources;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\u0005\u000b\u0010\u000e\u0007\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0001\u0004\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lak/a;", "", "<init>", "()V", "Landroid/content/res/Resources;", "resources", "", "c", "(Landroid/content/res/Resources;)Ljava/lang/String;", "Landroid/content/Context;", "context", "b", "(Landroid/content/Context;)Ljava/lang/String;", "", "e", "(Landroid/content/res/Resources;)Ljava/lang/CharSequence;", "d", "(Landroid/content/Context;)Ljava/lang/CharSequence;", "a", "Lak/a$b;", "Lak/a$c;", "Lak/a$d;", "Lak/a$e;", "i18n_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ak.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC5607a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f45514b = 0;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r\"\u00020\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lak/a$a;", "", "<init>", "()V", "Lak/a;", "a", "()Lak/a;", "", "text", "c", "(Ljava/lang/String;)Lak/a;", "", "stringResId", "", "formatArgs", "d", "(I[Ljava/lang/Object;)Lak/a;", PreferencesHelper.PREF_ID, "quantity", "b", "(II[Ljava/lang/Object;)Lak/a;", "i18n_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ak.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AbstractC5607a a() {
            return b.f45515c;
        }

        @JvmStatic
        public final AbstractC5607a b(int id2, int quantity, Object... formatArgs) {
            Intrinsics.j(formatArgs, "formatArgs");
            return new Plural(id2, quantity, CollectionsKt.R0(CollectionsKt.e(Integer.valueOf(quantity)), formatArgs));
        }

        @JvmStatic
        public final AbstractC5607a c(String text) {
            Intrinsics.j(text, "text");
            return text.length() == 0 ? a() : new Raw(text);
        }

        @JvmStatic
        public final AbstractC5607a d(int stringResId, Object... formatArgs) {
            Intrinsics.j(formatArgs, "formatArgs");
            return new Res(stringResId, ArraysKt.i1(formatArgs));
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lak/a$b;", "Lak/a;", "<init>", "()V", "Landroid/content/res/Resources;", "resources", "", "c", "(Landroid/content/res/Resources;)Ljava/lang/String;", "", "e", "(Landroid/content/res/Resources;)Ljava/lang/CharSequence;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "i18n_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ak.a$b */
    public static final /* data */ class b extends AbstractC5607a {

        /* renamed from: c, reason: collision with root package name */
        public static final b f45515c = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        @Override // ak.AbstractC5607a
        public String c(Resources resources) {
            Intrinsics.j(resources, "resources");
            return "";
        }

        @Override // ak.AbstractC5607a
        public CharSequence e(Resources resources) {
            Intrinsics.j(resources, "resources");
            return "";
        }

        public String toString() {
            return "Empty";
        }

        public int hashCode() {
            return 250863738;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lak/a$c;", "Lak/a;", "", "pluralResId", "quantity", "", "", "stringArgs", "<init>", "(IILjava/util/List;)V", "Landroid/content/res/Resources;", "resources", "", "c", "(Landroid/content/res/Resources;)Ljava/lang/String;", "", "e", "(Landroid/content/res/Resources;)Ljava/lang/CharSequence;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPluralResId", "d", "getQuantity", "Ljava/util/List;", "getStringArgs", "()Ljava/util/List;", "i18n_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ak.a$c, reason: from toString */
    public static final /* data */ class Plural extends AbstractC5607a {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int pluralResId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int quantity;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Object> stringArgs;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Plural)) {
                return false;
            }
            Plural plural = (Plural) other;
            return this.pluralResId == plural.pluralResId && this.quantity == plural.quantity && Intrinsics.e(this.stringArgs, plural.stringArgs);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Plural(int i10, int i11, List<? extends Object> stringArgs) {
            super(null);
            Intrinsics.j(stringArgs, "stringArgs");
            this.pluralResId = i10;
            this.quantity = i11;
            this.stringArgs = stringArgs;
        }

        @Override // ak.AbstractC5607a
        public String c(Resources resources) throws Resources.NotFoundException {
            Intrinsics.j(resources, "resources");
            int i10 = this.pluralResId;
            int i11 = this.quantity;
            List<Object> list = this.stringArgs;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            for (Object objC : list) {
                if (objC instanceof AbstractC5607a) {
                    objC = ((AbstractC5607a) objC).c(resources);
                }
                arrayList.add(objC);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            String quantityString = resources.getQuantityString(i10, i11, Arrays.copyOf(array, array.length));
            Intrinsics.i(quantityString, "getQuantityString(...)");
            return quantityString;
        }

        @Override // ak.AbstractC5607a
        public CharSequence e(Resources resources) throws Resources.NotFoundException {
            Intrinsics.j(resources, "resources");
            if (!this.stringArgs.isEmpty()) {
                throw new IllegalStateException("renderText() cannot render format arguments.");
            }
            CharSequence quantityText = resources.getQuantityText(this.pluralResId, this.quantity);
            Intrinsics.i(quantityText, "getQuantityText(...)");
            return quantityText;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.pluralResId) * 31) + Integer.hashCode(this.quantity)) * 31) + this.stringArgs.hashCode();
        }

        public String toString() {
            return "Plural(pluralResId=" + this.pluralResId + ", quantity=" + this.quantity + ", stringArgs=" + this.stringArgs + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lak/a$d;", "Lak/a;", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "Landroid/content/res/Resources;", "resources", "", "c", "(Landroid/content/res/Resources;)Ljava/lang/String;", "e", "(Landroid/content/res/Resources;)Ljava/lang/CharSequence;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/CharSequence;", "g", "()Ljava/lang/CharSequence;", "i18n_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ak.a$d, reason: from toString */
    public static final /* data */ class Raw extends AbstractC5607a {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CharSequence text;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Raw) && Intrinsics.e(this.text, ((Raw) other).text);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Raw(CharSequence text) {
            super(null);
            Intrinsics.j(text, "text");
            this.text = text;
        }

        @Override // ak.AbstractC5607a
        public String c(Resources resources) {
            Intrinsics.j(resources, "resources");
            return this.text.toString();
        }

        @Override // ak.AbstractC5607a
        public CharSequence e(Resources resources) {
            Intrinsics.j(resources, "resources");
            return this.text;
        }

        /* renamed from: g, reason: from getter */
        public final CharSequence getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Raw(text=" + ((Object) this.text) + ')';
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lak/a$e;", "Lak/a;", "", "stringResId", "", "", "stringArgs", "<init>", "(ILjava/util/List;)V", "Landroid/content/res/Resources;", "resources", "", "c", "(Landroid/content/res/Resources;)Ljava/lang/String;", "", "e", "(Landroid/content/res/Resources;)Ljava/lang/CharSequence;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "h", "d", "Ljava/util/List;", "g", "()Ljava/util/List;", "i18n_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: ak.a$e, reason: from toString */
    public static final /* data */ class Res extends AbstractC5607a {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int stringResId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Object> stringArgs;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Res)) {
                return false;
            }
            Res res = (Res) other;
            return this.stringResId == res.stringResId && Intrinsics.e(this.stringArgs, res.stringArgs);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Res(int i10, List<? extends Object> stringArgs) {
            super(null);
            Intrinsics.j(stringArgs, "stringArgs");
            this.stringResId = i10;
            this.stringArgs = stringArgs;
        }

        @Override // ak.AbstractC5607a
        public String c(Resources resources) throws Resources.NotFoundException {
            Intrinsics.j(resources, "resources");
            int i10 = this.stringResId;
            if (i10 == 0) {
                return CollectionsKt.B0(this.stringArgs, " ", null, null, 0, null, null, 62, null);
            }
            List<Object> list = this.stringArgs;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            for (Object objC : list) {
                if (objC instanceof AbstractC5607a) {
                    objC = ((AbstractC5607a) objC).c(resources);
                }
                arrayList.add(objC);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            String string = resources.getString(i10, Arrays.copyOf(array, array.length));
            Intrinsics.g(string);
            return string;
        }

        @Override // ak.AbstractC5607a
        public CharSequence e(Resources resources) throws Resources.NotFoundException {
            Intrinsics.j(resources, "resources");
            if (this.stringResId == 0) {
                return CollectionsKt.B0(this.stringArgs, " ", null, null, 0, null, null, 62, null);
            }
            if (!this.stringArgs.isEmpty()) {
                throw new IllegalStateException("renderText() cannot render format arguments.");
            }
            CharSequence text = resources.getText(this.stringResId);
            Intrinsics.g(text);
            return text;
        }

        public final List<Object> g() {
            return this.stringArgs;
        }

        /* renamed from: h, reason: from getter */
        public final int getStringResId() {
            return this.stringResId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.stringResId) * 31) + this.stringArgs.hashCode();
        }

        public String toString() {
            return "Res(stringResId=" + this.stringResId + ", stringArgs=" + this.stringArgs + ')';
        }
    }

    public /* synthetic */ AbstractC5607a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    public static final AbstractC5607a a() {
        return INSTANCE.a();
    }

    @JvmStatic
    public static final AbstractC5607a f(int i10, Object... objArr) {
        return INSTANCE.d(i10, objArr);
    }

    public abstract String c(Resources resources);

    public abstract CharSequence e(Resources resources);

    private AbstractC5607a() {
    }

    public final String b(Context context) {
        Intrinsics.j(context, "context");
        Resources resources = context.getResources();
        Intrinsics.i(resources, "getResources(...)");
        return c(resources);
    }

    public final CharSequence d(Context context) {
        Intrinsics.j(context, "context");
        Resources resources = context.getResources();
        Intrinsics.i(resources, "getResources(...)");
        return e(resources);
    }
}
