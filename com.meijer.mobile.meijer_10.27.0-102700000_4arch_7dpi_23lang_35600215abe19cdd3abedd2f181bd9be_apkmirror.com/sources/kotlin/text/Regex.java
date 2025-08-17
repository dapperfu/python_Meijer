package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 \u00152\u00060\u0001j\u0002`\u0002:\u00011B\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0005\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0016H\u0007¢\u0006\u0004\b!\u0010\u001aJ\u001d\u0010#\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J)\u0010'\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00100%¢\u0006\u0004\b'\u0010(J%\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070*2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010)\u001a\u00020\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "Lkotlin/text/RegexOption;", "option", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "", "options", "(Ljava/lang/String;Ljava/util/Set;)V", "", "input", "", "j", "(Ljava/lang/CharSequence;)Z", "b", "", "startIndex", "Lkotlin/text/MatchResult;", "c", "(Ljava/lang/CharSequence;I)Lkotlin/text/MatchResult;", "Lkotlin/sequences/Sequence;", "e", "(Ljava/lang/CharSequence;I)Lkotlin/sequences/Sequence;", "i", "(Ljava/lang/CharSequence;)Lkotlin/text/MatchResult;", "index", "h", "replacement", "k", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function1;", "transform", "l", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "limit", "", "m", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "a", "Ljava/util/regex/Pattern;", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class Regex implements Serializable {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Pattern nativePattern;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "<init>", "()V", "", "flags", "b", "(I)I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int flags) {
            return (flags & 2) != 0 ? flags | 64 : flags;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function1<MatchResult, MatchResult> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f147461b = new a();

        a() {
            super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MatchResult invoke(MatchResult p02) {
            Intrinsics.j(p02, "p0");
            return p02.next();
        }
    }

    @PublishedApi
    public Regex(Pattern nativePattern) {
        Intrinsics.j(nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }

    public static /* synthetic */ MatchResult d(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.c(charSequence, i10);
    }

    public static /* synthetic */ Sequence f(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.e(charSequence, i10);
    }

    public final boolean b(CharSequence input) {
        Intrinsics.j(input, "input");
        return this.nativePattern.matcher(input).find();
    }

    public final MatchResult c(CharSequence input, int startIndex) {
        Intrinsics.j(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        Intrinsics.i(matcher, "matcher(...)");
        return RegexKt.f(matcher, startIndex, input);
    }

    public final Sequence<MatchResult> e(final CharSequence input, final int startIndex) {
        Intrinsics.j(input, "input");
        if (startIndex >= 0 && startIndex <= input.length()) {
            return SequencesKt.s(new Function0() { // from class: ov.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Regex.g(this.f155253a, input, startIndex);
                }
            }, a.f147461b);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + startIndex + ", input length: " + input.length());
    }

    @SinceKotlin
    @WasExperimental
    public final MatchResult h(CharSequence input, int index) {
        Intrinsics.j(input, "input");
        Matcher matcherRegion = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(index, input.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        Intrinsics.g(matcherRegion);
        return new MatcherMatchResult(matcherRegion, input);
    }

    public final MatchResult i(CharSequence input) {
        Intrinsics.j(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        Intrinsics.i(matcher, "matcher(...)");
        return RegexKt.g(matcher, input);
    }

    public final boolean j(CharSequence input) {
        Intrinsics.j(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    public final String k(CharSequence input, String replacement) {
        Intrinsics.j(input, "input");
        Intrinsics.j(replacement, "replacement");
        String strReplaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        Intrinsics.i(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String l(CharSequence input, Function1<? super MatchResult, ? extends CharSequence> transform) {
        Intrinsics.j(input, "input");
        Intrinsics.j(transform, "transform");
        int iIntValue = 0;
        MatchResult matchResultD = d(this, input, 0, 2, null);
        if (matchResultD == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, iIntValue, matchResultD.c().getStart().intValue());
            sb2.append(transform.invoke(matchResultD));
            iIntValue = matchResultD.c().getEndInclusive().intValue() + 1;
            matchResultD = matchResultD.next();
            if (iIntValue >= length) {
                break;
            }
        } while (matchResultD != null);
        if (iIntValue < length) {
            sb2.append(input, iIntValue, length);
        }
        String string = sb2.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    public final List<String> m(CharSequence input, int limit) {
        Intrinsics.j(input, "input");
        StringsKt__StringsKt.V0(limit);
        Matcher matcher = this.nativePattern.matcher(input);
        if (limit == 1 || !matcher.find()) {
            return CollectionsKt.e(input.toString());
        }
        ArrayList arrayList = new ArrayList(limit > 0 ? RangesKt.k(limit, 10) : 10);
        int i10 = limit - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i10 >= 0 && arrayList.size() == i10) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.nativePattern.toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String pattern) {
        Intrinsics.j(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        Intrinsics.i(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult g(Regex regex, CharSequence charSequence, int i10) {
        return regex.c(charSequence, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String pattern, RegexOption option) {
        Intrinsics.j(pattern, "pattern");
        Intrinsics.j(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, INSTANCE.b(option.getValue()));
        Intrinsics.i(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String pattern, Set<? extends RegexOption> options) {
        Intrinsics.j(pattern, "pattern");
        Intrinsics.j(options, "options");
        Pattern patternCompile = Pattern.compile(pattern, INSTANCE.b(RegexKt.j(options)));
        Intrinsics.i(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
