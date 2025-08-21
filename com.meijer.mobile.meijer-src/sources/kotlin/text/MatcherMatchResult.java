package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001dR\u0014\u0010!\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\"¨\u0006$"}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", "matcher", "", "input", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "next", "()Lkotlin/text/MatchResult;", "a", "Ljava/util/regex/Matcher;", "b", "Ljava/lang/CharSequence;", "Lkotlin/text/MatchGroupCollection;", "c", "Lkotlin/text/MatchGroupCollection;", "d", "()Lkotlin/text/MatchGroupCollection;", "groups", "", "", "Ljava/util/List;", "groupValues_", "Ljava/util/regex/MatchResult;", "f", "()Ljava/util/regex/MatchResult;", "matchResult", "Lkotlin/ranges/IntRange;", "()Lkotlin/ranges/IntRange;", "range", "getValue", "()Ljava/lang/String;", "value", "()Ljava/util/List;", "groupValues", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
final class MatcherMatchResult implements MatchResult {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Matcher matcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CharSequence input;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MatchGroupCollection groups;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<String> groupValues_;

    public MatcherMatchResult(Matcher matcher, CharSequence input) {
        Intrinsics.j(matcher, "matcher");
        Intrinsics.j(input, "input");
        this.matcher = matcher;
        this.input = input;
        this.groups = new MatcherMatchResult$groups$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.regex.MatchResult f() {
        return this.matcher;
    }

    @Override // kotlin.text.MatchResult
    public List<String> b() {
        if (this.groupValues_ == null) {
            this.groupValues_ = new AbstractList<String>() { // from class: kotlin.text.MatcherMatchResult$groupValues$1
                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ boolean contains(Object obj) {
                    if (obj instanceof String) {
                        return k((String) obj);
                    }
                    return false;
                }

                @Override // kotlin.collections.AbstractCollection
                /* renamed from: f */
                public int getSize() {
                    return this.f148363b.f().groupCount() + 1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int indexOf(Object obj) {
                    if (obj instanceof String) {
                        return o((String) obj);
                    }
                    return -1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
                    if (obj instanceof String) {
                        return p((String) obj);
                    }
                    return -1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public String get(int index) {
                    String strGroup = this.f148363b.f().group(index);
                    return strGroup == null ? "" : strGroup;
                }

                public /* bridge */ boolean k(String str) {
                    return super.contains(str);
                }

                public /* bridge */ int o(String str) {
                    return super.indexOf(str);
                }

                public /* bridge */ int p(String str) {
                    return super.lastIndexOf(str);
                }
            };
        }
        List<String> list = this.groupValues_;
        Intrinsics.g(list);
        return list;
    }

    @Override // kotlin.text.MatchResult
    /* renamed from: d, reason: from getter */
    public MatchGroupCollection getGroups() {
        return this.groups;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult.Destructured a() {
        return MatchResult.DefaultImpls.a(this);
    }

    @Override // kotlin.text.MatchResult
    public IntRange c() {
        return RegexKt.h(f());
    }

    @Override // kotlin.text.MatchResult
    public String getValue() {
        String strGroup = f().group();
        Intrinsics.i(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    public MatchResult next() {
        int i10;
        int iEnd = f().end();
        if (f().end() == f().start()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = iEnd + i10;
        if (i11 <= this.input.length()) {
            Matcher matcher = this.matcher.pattern().matcher(this.input);
            Intrinsics.i(matcher, "matcher(...)");
            return RegexKt.f(matcher, i11, this.input);
        }
        return null;
    }
}
