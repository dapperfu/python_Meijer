package z1;

import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.C17334A;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001\u001fB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u000bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Lz1/M;", "", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/y;", "selection", "composition", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/y;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "text", "(Ljava/lang/String;JLandroidx/compose/ui/text/y;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/y;)Lz1/M;", "b", "(Ljava/lang/String;JLandroidx/compose/ui/text/y;)Lz1/M;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/text/AnnotatedString;", "e", "()Landroidx/compose/ui/text/AnnotatedString;", "J", "g", "()J", "c", "Landroidx/compose/ui/text/y;", "f", "()Landroidx/compose/ui/text/y;", "h", "d", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z1.M, reason: from toString */
/* loaded from: classes2.dex */
public final class TextFieldValue {

    /* renamed from: e, reason: collision with root package name */
    private static final L0.k<TextFieldValue, Object> f172224e = L0.l.a(a.f172228f, b.f172229f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AnnotatedString text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long selection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final androidx.compose.ui.text.y composition;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lz1/M;", "a", "(Ljava/lang/Object;)Lz1/M;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: z1.M$b */
    static final class b extends Lambda implements Function1<Object, TextFieldValue> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f172229f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextFieldValue invoke(Object obj) {
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            L0.k<AnnotatedString, Object> kVarH = androidx.compose.ui.text.q.h();
            Boolean bool = Boolean.FALSE;
            androidx.compose.ui.text.y yVarB = null;
            AnnotatedString annotatedStringB = ((!Intrinsics.e(obj2, bool) || (kVarH instanceof androidx.compose.ui.text.j)) && obj2 != null) ? kVarH.b(obj2) : null;
            Intrinsics.g(annotatedStringB);
            Object obj3 = list.get(1);
            L0.k<androidx.compose.ui.text.y, Object> kVarU = androidx.compose.ui.text.q.u(androidx.compose.ui.text.y.INSTANCE);
            if ((!Intrinsics.e(obj3, bool) || (kVarU instanceof androidx.compose.ui.text.j)) && obj3 != null) {
                yVarB = kVarU.b(obj3);
            }
            Intrinsics.g(yVarB);
            return new TextFieldValue(annotatedStringB, yVarB.getPackedValue(), (androidx.compose.ui.text.y) null, 4, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j10, androidx.compose.ui.text.y yVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j10, yVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) other;
        return androidx.compose.ui.text.y.g(this.selection, textFieldValue.selection) && Intrinsics.e(this.composition, textFieldValue.composition) && Intrinsics.e(this.text, textFieldValue.text);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Lz1/M;", "it", "", "a", "(LL0/m;Lz1/M;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z1.M$a */
    static final class a extends Lambda implements Function2<L0.m, TextFieldValue, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f172228f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L0.m mVar, TextFieldValue textFieldValue) {
            return CollectionsKt.g(androidx.compose.ui.text.q.z(textFieldValue.getText(), androidx.compose.ui.text.q.h(), mVar), androidx.compose.ui.text.q.z(androidx.compose.ui.text.y.b(textFieldValue.getSelection()), androidx.compose.ui.text.q.u(androidx.compose.ui.text.y.INSTANCE), mVar));
        }
    }

    public /* synthetic */ TextFieldValue(String str, long j10, androidx.compose.ui.text.y yVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j10, yVar);
    }

    public static /* synthetic */ TextFieldValue c(TextFieldValue textFieldValue, AnnotatedString annotatedString, long j10, androidx.compose.ui.text.y yVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            annotatedString = textFieldValue.text;
        }
        if ((i10 & 2) != 0) {
            j10 = textFieldValue.selection;
        }
        if ((i10 & 4) != 0) {
            yVar = textFieldValue.composition;
        }
        return textFieldValue.a(annotatedString, j10, yVar);
    }

    public static /* synthetic */ TextFieldValue d(TextFieldValue textFieldValue, String str, long j10, androidx.compose.ui.text.y yVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = textFieldValue.selection;
        }
        if ((i10 & 4) != 0) {
            yVar = textFieldValue.composition;
        }
        return textFieldValue.b(str, j10, yVar);
    }

    public final TextFieldValue a(AnnotatedString annotatedString, long selection, androidx.compose.ui.text.y composition) {
        return new TextFieldValue(annotatedString, selection, composition, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldValue b(String text, long selection, androidx.compose.ui.text.y composition) {
        return new TextFieldValue(new AnnotatedString(text, null, 2, 0 == true ? 1 : 0), selection, composition, (DefaultConstructorMarker) null);
    }

    /* renamed from: e, reason: from getter */
    public final AnnotatedString getText() {
        return this.text;
    }

    /* renamed from: f, reason: from getter */
    public final androidx.compose.ui.text.y getComposition() {
        return this.composition;
    }

    /* renamed from: g, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    public final String h() {
        return this.text.getText();
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + androidx.compose.ui.text.y.o(this.selection)) * 31;
        androidx.compose.ui.text.y yVar = this.composition;
        return iHashCode + (yVar != null ? androidx.compose.ui.text.y.o(yVar.getPackedValue()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.text) + "', selection=" + ((Object) androidx.compose.ui.text.y.q(this.selection)) + ", composition=" + this.composition + ')';
    }

    private TextFieldValue(AnnotatedString annotatedString, long j10, androidx.compose.ui.text.y yVar) {
        this.text = annotatedString;
        this.selection = C17334A.c(j10, 0, h().length());
        this.composition = yVar != null ? androidx.compose.ui.text.y.b(C17334A.c(yVar.getPackedValue(), 0, h().length())) : null;
    }

    public /* synthetic */ TextFieldValue(AnnotatedString annotatedString, long j10, androidx.compose.ui.text.y yVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, (i10 & 2) != 0 ? androidx.compose.ui.text.y.INSTANCE.a() : j10, (i10 & 4) != 0 ? null : yVar, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j10, androidx.compose.ui.text.y yVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? androidx.compose.ui.text.y.INSTANCE.a() : j10, (i10 & 4) != 0 ? null : yVar, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldValue(String str, long j10, androidx.compose.ui.text.y yVar) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j10, yVar, (DefaultConstructorMarker) null);
    }
}
