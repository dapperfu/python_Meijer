package androidx.compose.ui.text;

import Z.C5518p;
import Z.J;
import com.fullstory.instrumentation.frameworks.compose.FSComposeAnnotatedString;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 /2\u00020\u0001:\u0004?\u0013AGB)\b\u0000\u0012\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u0002¢\u0006\u0004\b\b\u0010\u000eB)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\b\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J%\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J)\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b(\u0010)J)\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b+\u0010)J+\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010H\u0007¢\u0006\u0004\b-\u0010)J)\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b/\u0010)J\u001d\u00100\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020%2\b\u0010\u001d\u001a\u0004\u0018\u000102H\u0096\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0010H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b9\u0010:J1\u0010=\u001a\u00020\u00002\"\u0010<\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030;¢\u0006\u0004\b=\u0010>J7\u0010?\u001a\u00020\u00002(\u0010<\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00020;¢\u0006\u0004\b?\u0010>R*\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u00108R(\u0010F\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010@\u001a\u0004\bE\u0010BR(\u0010I\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010@\u001a\u0004\bH\u0010BR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028F¢\u0006\u0006\u001a\u0004\bJ\u0010BR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010BR\u0014\u0010L\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006M"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/AnnotatedString$a;", "annotations", "", "text", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Landroidx/compose/ui/text/s;", "spanStyles", "Landroidx/compose/ui/text/n;", "paragraphStyles", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;)V", "", "index", "", "b", "(I)C", "startIndex", "endIndex", "s", "(II)Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/y;", "range", "t", "(J)Landroidx/compose/ui/text/AnnotatedString;", "other", "r", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/AnnotatedString;", "tag", "start", "end", "k", "(Ljava/lang/String;II)Ljava/util/List;", "", "p", "(Ljava/lang/String;II)Z", "j", "(II)Ljava/util/List;", "Landroidx/compose/ui/text/A;", "l", "Landroidx/compose/ui/text/B;", "m", "Landroidx/compose/ui/text/f;", "e", "o", "(II)Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "n", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "Lkotlin/Function1;", "transform", "q", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/AnnotatedString;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "getText", "i", "spanStylesOrNull", "d", "g", "paragraphStylesOrNull", "h", "f", "length", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AnnotatedString implements CharSequence, FSComposeAnnotatedString {

    /* renamed from: f, reason: collision with root package name */
    private static final L0.k<AnnotatedString, ?> f52406f = q.h();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Range<? extends a>> annotations;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Range<SpanStyle>> spanStylesOrNull;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0007\u0002\u0003\u0004\u0005\u0006\u0007\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$a;", "", "Landroidx/compose/ui/text/d;", "Landroidx/compose/ui/text/f;", "Landroidx/compose/ui/text/n;", "Landroidx/compose/ui/text/s;", "Landroidx/compose/ui/text/t;", "Landroidx/compose/ui/text/A;", "Landroidx/compose/ui/text/B;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    @Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u001e\u0017B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\tJ\u0019\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u000bJ%\u0010\u001a\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b,\u0010-J\u0015\u00100\u001a\u00020\u00032\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\f¢\u0006\u0004\b2\u00103J\u0015\u00105\u001a\u00020\f2\u0006\u00104\u001a\u00020\u0003¢\u0006\u0004\b5\u0010\u0006J\r\u00106\u001a\u00020\n¢\u0006\u0004\b6\u00107J3\u0010<\u001a\u00020\f2\"\u0010;\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020:09\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020:0908H\u0000¢\u0006\u0004\b<\u0010=J9\u0010?\u001a\u00020\f2(\u0010;\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020:09\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020:090>08H\u0000¢\u0006\u0004\b?\u0010=R\u0018\u0010\b\u001a\u00060@j\u0002`A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010BR\"\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020E0D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010FR\"\u0010H\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020:0D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010FR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010J¨\u0006L"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$b;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "capacity", "<init>", "(I)V", "", "text", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;)V", "", "g", "", "c", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString$b;", "start", "end", "d", "(Ljava/lang/CharSequence;II)Landroidx/compose/ui/text/AnnotatedString$b;", "", "char", "b", "(C)Landroidx/compose/ui/text/AnnotatedString$b;", "e", "f", "(Landroidx/compose/ui/text/AnnotatedString;II)V", "Landroidx/compose/ui/text/s;", "style", "a", "(Landroidx/compose/ui/text/s;II)V", "n", "(Landroidx/compose/ui/text/s;)I", "tag", "annotation", "m", "(Ljava/lang/String;Ljava/lang/String;)I", "Landroidx/compose/ui/text/A;", "ttsAnnotation", "o", "(Landroidx/compose/ui/text/A;)I", "Landroidx/compose/ui/text/B;", "urlAnnotation", "p", "(Landroidx/compose/ui/text/B;)I", "Landroidx/compose/ui/text/f;", "link", "l", "(Landroidx/compose/ui/text/f;)I", "j", "()V", "index", "k", "q", "()Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/AnnotatedString$a;", "transform", "i", "(Lkotlin/jvm/functions/Function1;)V", "", "h", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "", "Landroidx/compose/ui/text/AnnotatedString$b$b;", "", "Ljava/util/List;", "styleStack", "annotations", "Landroidx/compose/ui/text/AnnotatedString$b$a;", "Landroidx/compose/ui/text/AnnotatedString$b$a;", "bulletScope", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b implements Appendable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final StringBuilder text;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<MutableRange<? extends Object>> styleStack;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<MutableRange<? extends a>> annotations;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final a bulletScope;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\b\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0017B+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u0017\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006$"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$b$b;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "defaultEnd", "Landroidx/compose/ui/text/AnnotatedString$d;", "b", "(I)Landroidx/compose/ui/text/AnnotatedString$d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getItem", "()Ljava/lang/Object;", "I", "getStart", "c", "getEnd", "(I)V", "d", "Ljava/lang/String;", "getTag", "e", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: androidx.compose.ui.text.AnnotatedString$b$b, reason: collision with other inner class name and from toString */
        private static final /* data */ class MutableRange<T> {

            /* renamed from: e, reason: collision with root package name and from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final T item;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int start;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private int end;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String tag;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$b$b$a;", "", "<init>", "()V", "T", "Landroidx/compose/ui/text/AnnotatedString$d;", "range", "Landroidx/compose/ui/text/AnnotatedString$b$b;", "a", "(Landroidx/compose/ui/text/AnnotatedString$d;)Landroidx/compose/ui/text/AnnotatedString$b$b;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: androidx.compose.ui.text.AnnotatedString$b$b$a, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final <T> MutableRange<T> a(Range<T> range) {
                    return new MutableRange<>(range.g(), range.h(), range.f(), range.getTag());
                }
            }

            public MutableRange(T t10, int i10, int i11, String str) {
                this.item = t10;
                this.start = i10;
                this.end = i11;
                this.tag = str;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) other;
                return Intrinsics.e(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && Intrinsics.e(this.tag, mutableRange.tag);
            }

            public int hashCode() {
                T t10 = this.item;
                return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public static /* synthetic */ Range c(MutableRange mutableRange, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = Integer.MIN_VALUE;
                }
                return mutableRange.b(i10);
            }

            public final void a(int i10) {
                this.end = i10;
            }

            public final Range<T> b(int defaultEnd) {
                int i10 = this.end;
                if (i10 != Integer.MIN_VALUE) {
                    defaultEnd = i10;
                }
                if (!(defaultEnd != Integer.MIN_VALUE)) {
                    A1.a.c("Item.end should be set first");
                }
                return new Range<>(this.item, this.start, defaultEnd, this.tag);
            }

            public /* synthetic */ MutableRange(Object obj, int i10, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
            }
        }

        public b(int i10) {
            this.text = new StringBuilder(i10);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            this.bulletScope = new a(this);
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR,\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$b$a;", "", "Landroidx/compose/ui/text/AnnotatedString$b;", "builder", "<init>", "(Landroidx/compose/ui/text/AnnotatedString$b;)V", "a", "Landroidx/compose/ui/text/AnnotatedString$b;", "getBuilder$ui_text_release", "()Landroidx/compose/ui/text/AnnotatedString$b;", "", "Lkotlin/Pair;", "LH1/v;", "Landroidx/compose/ui/text/d;", "b", "Ljava/util/List;", "getBulletListSettingStack$ui_text_release", "()Ljava/util/List;", "bulletListSettingStack", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final b builder;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final List<Pair<H1.v, Bullet>> bulletListSettingStack = new ArrayList();

            public a(b bVar) {
                this.builder = bVar;
            }
        }

        public final void a(SpanStyle style, int start, int end) {
            this.annotations.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b append(char c10) {
            this.text.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b append(CharSequence text) {
            if (text instanceof AnnotatedString) {
                e((AnnotatedString) text);
                return this;
            }
            this.text.append(text);
            return this;
        }

        @Override // java.lang.Appendable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b append(CharSequence text, int start, int end) {
            if (text instanceof AnnotatedString) {
                f((AnnotatedString) text, start, end);
                return this;
            }
            this.text.append(text, start, end);
            return this;
        }

        public final void e(AnnotatedString text) {
            int length = this.text.length();
            this.text.append(text.getText());
            List<Range<? extends a>> listC = text.c();
            if (listC != null) {
                int size = listC.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Range<? extends a> range = listC.get(i10);
                    this.annotations.add(new MutableRange<>(range.g(), range.h() + length, range.f() + length, range.getTag()));
                }
            }
        }

        public final void f(AnnotatedString text, int start, int end) {
            int length = this.text.length();
            this.text.append((CharSequence) text.getText(), start, end);
            List listH = C5913b.h(text, start, end, null, 4, null);
            if (listH != null) {
                int size = listH.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Range range = (Range) listH.get(i10);
                    this.annotations.add(new MutableRange<>(range.g(), range.h() + length, range.f() + length, range.getTag()));
                }
            }
        }

        public final void g(String text) {
            this.text.append(text);
        }

        public final void h(Function1<? super Range<? extends a>, ? extends List<? extends Range<? extends a>>> transform) {
            List<MutableRange<? extends a>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<? extends Range<? extends a>> listInvoke = transform.invoke(MutableRange.c(list.get(i10), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(listInvoke.size());
                int size2 = listInvoke.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList2.add(MutableRange.INSTANCE.a(listInvoke.get(i11)));
                }
                CollectionsKt.C(arrayList, arrayList2);
            }
            this.annotations.clear();
            this.annotations.addAll(arrayList);
        }

        public final void i(Function1<? super Range<? extends a>, ? extends Range<? extends a>> transform) {
            int size = this.annotations.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.annotations.set(i10, MutableRange.INSTANCE.a(transform.invoke(MutableRange.c(this.annotations.get(i10), 0, 1, null))));
            }
        }

        public final void j() {
            if (this.styleStack.isEmpty()) {
                A1.a.c("Nothing to pop.");
            }
            this.styleStack.remove(r0.size() - 1).a(this.text.length());
        }

        public final void k(int index) {
            if (!(index < this.styleStack.size())) {
                A1.a.c(index + " should be less than " + this.styleStack.size());
            }
            while (this.styleStack.size() - 1 >= index) {
                j();
            }
        }

        public final int l(f link) {
            MutableRange<? extends a> mutableRange = new MutableRange<>(link, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int m(String tag, String annotation) {
            MutableRange<? extends a> mutableRange = new MutableRange<>(t.a(t.b(annotation)), this.text.length(), 0, tag, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int n(SpanStyle style) {
            MutableRange<? extends a> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int o(A ttsAnnotation) {
            MutableRange<? extends a> mutableRange = new MutableRange<>(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @Deprecated
        public final int p(UrlAnnotation urlAnnotation) {
            MutableRange<? extends a> mutableRange = new MutableRange<>(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final AnnotatedString q() {
            String string = this.text.toString();
            List<MutableRange<? extends a>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).b(this.text.length()));
            }
            return new AnnotatedString(string, arrayList);
        }

        public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        public b(String str) {
            this(0, 1, null);
            g(str);
        }

        public b(AnnotatedString annotatedString) {
            this(0, 1, null);
            e(annotatedString);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ>\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$d;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "a", "()Ljava/lang/Object;", "b", "()I", "c", "d", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$d;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "g", "I", "h", "f", "Ljava/lang/String;", "i", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.text.AnnotatedString$d, reason: from toString */
    public static final /* data */ class Range<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final T item;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int start;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int end;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tag;

        public Range(T t10, int i10, int i11, String str) {
            this.item = t10;
            this.start = i10;
            this.end = i11;
            this.tag = str;
            if (i10 <= i11) {
                return;
            }
            A1.a.a("Reversed range is not supported");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range e(Range range, Object obj, int i10, int i11, String str, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = range.item;
            }
            if ((i12 & 2) != 0) {
                i10 = range.start;
            }
            if ((i12 & 4) != 0) {
                i11 = range.end;
            }
            if ((i12 & 8) != 0) {
                str = range.tag;
            }
            return range.d(obj, i10, i11, str);
        }

        public final T a() {
            return this.item;
        }

        /* renamed from: b, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: c, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        public final Range<T> d(T item, int start, int end, String tag) {
            return new Range<>(item, start, end, tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return Intrinsics.e(this.item, range.item) && this.start == range.start && this.end == range.end && Intrinsics.e(this.tag, range.tag);
        }

        public int hashCode() {
            T t10 = this.item;
            return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public final int f() {
            return this.end;
        }

        public final T g() {
            return this.item;
        }

        public final int h() {
            return this.start;
        }

        /* renamed from: i, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public Range(T t10, int i10, int i11) {
            this(t10, i10, i11, "");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(Integer.valueOf(((Range) t10).h()), Integer.valueOf(((Range) t11).h()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(List<? extends Range<? extends a>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.annotations = list;
        this.text = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                Range<SpanStyle> range = (Range) list.get(i10);
                if (range.g() instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    Intrinsics.h(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList.add(range);
                } else if (range.g() instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    Intrinsics.h(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.spanStylesOrNull = arrayList;
        this.paragraphStylesOrNull = arrayList2;
        List listZ0 = arrayList2 != null ? CollectionsKt.Z0(arrayList2, new e()) : null;
        List list2 = listZ0;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        J jD = C5518p.d(((Range) CollectionsKt.s0(listZ0)).f());
        int size2 = listZ0.size();
        for (int i11 = 1; i11 < size2; i11++) {
            Range range2 = (Range) listZ0.get(i11);
            while (true) {
                if (jD._size == 0) {
                    break;
                }
                int i12 = jD.i();
                if (range2.h() >= i12) {
                    jD.o(jD._size - 1);
                } else if (!(range2.f() <= i12)) {
                    A1.a.a("Paragraph overlap not allowed, end " + range2.f() + " should be less than or equal to " + i12);
                }
            }
            jD.k(range2.f());
        }
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeAnnotatedString
    public final String _fsGetText() {
        return getText();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) other;
        return Intrinsics.e(this.text, annotatedString.text) && Intrinsics.e(this.annotations, annotatedString.annotations);
    }

    public final AnnotatedString a(Function1<? super Range<? extends a>, ? extends List<? extends Range<? extends a>>> transform) {
        b bVar = new b(this);
        bVar.h(transform);
        return bVar.q();
    }

    public char b(int index) {
        return this.text.charAt(index);
    }

    public final List<Range<? extends a>> c() {
        return this.annotations;
    }

    public int d() {
        return this.text.length();
    }

    public final List<Range<f>> e(int start, int end) {
        List listM;
        List<Range<? extends a>> list = this.annotations;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends a> range = list.get(i10);
                Range<? extends a> range2 = range;
                if ((range2.g() instanceof f) && C5913b.i(start, end, range2.h(), range2.f())) {
                    listM.add(range);
                }
            }
        } else {
            listM = CollectionsKt.m();
        }
        Intrinsics.h(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listM;
    }

    public final List<Range<ParagraphStyle>> f() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? CollectionsKt.m() : list;
    }

    public final List<Range<ParagraphStyle>> g() {
        return this.paragraphStylesOrNull;
    }

    public final String getText() {
        return this.text;
    }

    public final List<Range<SpanStyle>> h() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? CollectionsKt.m() : list;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        List<Range<? extends a>> list = this.annotations;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final List<Range<SpanStyle>> i() {
        return this.spanStylesOrNull;
    }

    public final List<Range<String>> j(int start, int end) {
        List<Range<? extends a>> list = this.annotations;
        if (list == null) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Range<? extends a> range = list.get(i10);
            if ((range.g() instanceof t) && C5913b.i(start, end, range.h(), range.f())) {
                arrayList.add(u.a(range));
            }
        }
        return arrayList;
    }

    public final List<Range<String>> k(String tag, int start, int end) {
        List<Range<? extends a>> list = this.annotations;
        if (list == null) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Range<? extends a> range = list.get(i10);
            if ((range.g() instanceof t) && Intrinsics.e(tag, range.getTag()) && C5913b.i(start, end, range.h(), range.f())) {
                arrayList.add(u.a(range));
            }
        }
        return arrayList;
    }

    public final List<Range<A>> l(int start, int end) {
        List listM;
        List<Range<? extends a>> list = this.annotations;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends a> range = list.get(i10);
                Range<? extends a> range2 = range;
                if ((range2.g() instanceof A) && C5913b.i(start, end, range2.h(), range2.f())) {
                    listM.add(range);
                }
            }
        } else {
            listM = CollectionsKt.m();
        }
        Intrinsics.h(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listM;
    }

    @Deprecated
    public final List<Range<UrlAnnotation>> m(int start, int end) {
        List listM;
        List<Range<? extends a>> list = this.annotations;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends a> range = list.get(i10);
                Range<? extends a> range2 = range;
                if ((range2.g() instanceof UrlAnnotation) && C5913b.i(start, end, range2.h(), range2.f())) {
                    listM.add(range);
                }
            }
        } else {
            listM = CollectionsKt.m();
        }
        Intrinsics.h(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listM;
    }

    public final boolean n(AnnotatedString other) {
        return Intrinsics.e(this.annotations, other.annotations);
    }

    public final boolean o(int start, int end) {
        List<Range<? extends a>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends a> range = list.get(i10);
                if ((range.g() instanceof f) && C5913b.i(start, end, range.h(), range.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean p(String tag, int start, int end) {
        List<Range<? extends a>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends a> range = list.get(i10);
                if ((range.g() instanceof t) && Intrinsics.e(tag, range.getTag()) && C5913b.i(start, end, range.h(), range.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final AnnotatedString q(Function1<? super Range<? extends a>, ? extends Range<? extends a>> transform) {
        b bVar = new b(this);
        bVar.i(transform);
        return bVar.q();
    }

    public final AnnotatedString r(AnnotatedString other) {
        b bVar = new b(this);
        bVar.e(other);
        return bVar.q();
    }

    @Override // java.lang.CharSequence
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public AnnotatedString subSequence(int startIndex, int endIndex) {
        if (!(startIndex <= endIndex)) {
            A1.a.a("start (" + startIndex + ") should be less or equal to end (" + endIndex + ')');
        }
        if (startIndex == 0 && endIndex == this.text.length()) {
            return this;
        }
        String strSubstring = this.text.substring(startIndex, endIndex);
        Intrinsics.i(strSubstring, "substring(...)");
        return new AnnotatedString((List<? extends Range<? extends a>>) C5913b.f(this.annotations, startIndex, endIndex), strSubstring);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return b(i10);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return d();
    }

    public final AnnotatedString t(long range) {
        return subSequence(y.l(range), y.k(range));
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? CollectionsKt.m() : list2);
    }

    public AnnotatedString(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        this((List<? extends Range<? extends a>>) C5913b.d(list, list2), str);
    }

    public /* synthetic */ AnnotatedString(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (List<? extends Range<? extends a>>) ((i10 & 2) != 0 ? CollectionsKt.m() : list));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnnotatedString(String str, List<? extends Range<? extends a>> list) {
        List<? extends Range<? extends a>> list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
