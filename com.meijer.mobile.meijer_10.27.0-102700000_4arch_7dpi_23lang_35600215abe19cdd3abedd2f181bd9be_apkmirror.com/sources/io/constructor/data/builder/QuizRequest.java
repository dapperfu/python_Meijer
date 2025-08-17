package io.constructor.data.builder;

import io.constructor.data.builder.QuizRequest;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0011\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u007f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011R\u001f\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R%\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\n\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001b¨\u0006!"}, d2 = {"Lio/constructor/data/builder/QuizRequest;", "", "builder", "Lio/constructor/data/builder/QuizRequest$Builder;", "(Lio/constructor/data/builder/QuizRequest$Builder;)V", "quizId", "", "quizVersionId", "quizSessionId", "answers", "", "section", "page", "", "perPage", "filters", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)V", "getAnswers", "()Ljava/util/List;", "getFilters", "()Ljava/util/Map;", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPerPage", "getQuizId", "()Ljava/lang/String;", "getQuizSessionId", "getQuizVersionId", "getSection", "Builder", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class QuizRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<List<String>> answers;
    private final Map<String, List<String>> filters;
    private final Integer page;
    private final Integer perPage;
    private final String quizId;
    private final String quizSessionId;
    private final String quizVersionId;
    private final String section;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010&\u001a\u00020'J\u001a\u0010\t\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u0006J \u0010\u000f\u001a\u00020\u00002\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\fJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0003J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0003J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0003R(\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR.\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001c\"\u0004\b\u001f\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u0004¨\u0006)"}, d2 = {"Lio/constructor/data/builder/QuizRequest$Builder;", "", "quizId", "", "(Ljava/lang/String;)V", "answers", "", "getAnswers", "()Ljava/util/List;", "setAnswers", "(Ljava/util/List;)V", "filters", "", "getFilters", "()Ljava/util/Map;", "setFilters", "(Ljava/util/Map;)V", "page", "", "getPage", "()Ljava/lang/Integer;", "setPage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "perPage", "getPerPage", "setPerPage", "getQuizId", "()Ljava/lang/String;", "quizSessionId", "getQuizSessionId", "setQuizSessionId", "quizVersionId", "getQuizVersionId", "setQuizVersionId", "section", "getSection", "setSection", "build", "Lio/constructor/data/builder/QuizRequest;", "facets", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {
        private List<? extends List<String>> answers;
        private Map<String, ? extends List<String>> filters;
        private Integer page;
        private Integer perPage;
        private final String quizId;
        private String quizSessionId;
        private String quizVersionId;
        private String section;

        /* renamed from: setAnswers, reason: collision with other method in class */
        public final void m128setAnswers(List<? extends List<String>> list) {
            this.answers = list;
        }

        /* renamed from: setFilters, reason: collision with other method in class */
        public final void m129setFilters(Map<String, ? extends List<String>> map) {
            this.filters = map;
        }

        public final void setPage(Integer num) {
            this.page = num;
        }

        public final void setPerPage(Integer num) {
            this.perPage = num;
        }

        /* renamed from: setQuizSessionId, reason: collision with other method in class */
        public final void m130setQuizSessionId(String str) {
            this.quizSessionId = str;
        }

        /* renamed from: setQuizVersionId, reason: collision with other method in class */
        public final void m131setQuizVersionId(String str) {
            this.quizVersionId = str;
        }

        /* renamed from: setSection, reason: collision with other method in class */
        public final void m132setSection(String str) {
            this.section = str;
        }

        public Builder(String quizId) {
            Intrinsics.j(quizId, "quizId");
            this.quizId = quizId;
        }

        public final QuizRequest build() {
            return new QuizRequest(this, null);
        }

        public final List<List<String>> getAnswers() {
            return this.answers;
        }

        public final Map<String, List<String>> getFilters() {
            return this.filters;
        }

        public final Integer getPage() {
            return this.page;
        }

        public final Integer getPerPage() {
            return this.perPage;
        }

        public final String getQuizId() {
            return this.quizId;
        }

        public final String getQuizSessionId() {
            return this.quizSessionId;
        }

        public final String getQuizVersionId() {
            return this.quizVersionId;
        }

        public final String getSection() {
            return this.section;
        }

        public final Builder setAnswers(List<? extends List<String>> answers) {
            Intrinsics.j(answers, "answers");
            m128setAnswers(answers);
            return this;
        }

        public final Builder setFilters(Map<String, ? extends List<String>> facets) {
            Intrinsics.j(facets, "facets");
            m129setFilters(facets);
            return this;
        }

        public final Builder setPage(int page) {
            setPage(Integer.valueOf(page));
            return this;
        }

        public final Builder setPerPage(int perPage) {
            setPerPage(Integer.valueOf(perPage));
            return this;
        }

        public final Builder setQuizSessionId(String quizSessionId) {
            Intrinsics.j(quizSessionId, "quizSessionId");
            m130setQuizSessionId(quizSessionId);
            return this;
        }

        public final Builder setQuizVersionId(String quizVersionId) {
            Intrinsics.j(quizVersionId, "quizVersionId");
            m131setQuizVersionId(quizVersionId);
            return this;
        }

        public final Builder setSection(String section) {
            Intrinsics.j(section, "section");
            m132setSection(section);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Lio/constructor/data/builder/QuizRequest$Companion;", "", "()V", "build", "Lio/constructor/data/builder/QuizRequest;", "quizId", "", "block", "Lkotlin/Function1;", "Lio/constructor/data/builder/QuizRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ QuizRequest build$default(Companion companion, String quizId, Function1 block, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                block = new Function1<Builder, Unit>() { // from class: io.constructor.data.builder.QuizRequest$Companion$build$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(QuizRequest.Builder builder) {
                        Intrinsics.j(builder, "$this$null");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(QuizRequest.Builder builder) {
                        invoke2(builder);
                        return Unit.f142422a;
                    }
                };
            }
            Intrinsics.j(quizId, "quizId");
            Intrinsics.j(block, "block");
            Builder builder = new Builder(quizId);
            block.invoke(builder);
            return builder.build();
        }

        public final QuizRequest build(String quizId, Function1<? super Builder, Unit> block) {
            Intrinsics.j(quizId, "quizId");
            Intrinsics.j(block, "block");
            Builder builder = new Builder(quizId);
            block.invoke(builder);
            return builder.build();
        }
    }

    public /* synthetic */ QuizRequest(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuizRequest(String quizId, String str, String str2, List<? extends List<String>> list, String str3, Integer num, Integer num2, Map<String, ? extends List<String>> map) {
        Intrinsics.j(quizId, "quizId");
        this.quizId = quizId;
        this.quizVersionId = str;
        this.quizSessionId = str2;
        this.answers = list;
        this.section = str3;
        this.page = num;
        this.perPage = num2;
        this.filters = map;
    }

    public final List<List<String>> getAnswers() {
        return this.answers;
    }

    public final Map<String, List<String>> getFilters() {
        return this.filters;
    }

    public final Integer getPage() {
        return this.page;
    }

    public final Integer getPerPage() {
        return this.perPage;
    }

    public final String getQuizId() {
        return this.quizId;
    }

    public final String getQuizSessionId() {
        return this.quizSessionId;
    }

    public final String getQuizVersionId() {
        return this.quizVersionId;
    }

    public final String getSection() {
        return this.section;
    }

    public /* synthetic */ QuizRequest(String str, String str2, String str3, List list, String str4, Integer num, Integer num2, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : num, (i10 & 64) != 0 ? null : num2, (i10 & 128) != 0 ? null : map);
    }

    private QuizRequest(Builder builder) {
        this(builder.getQuizId(), builder.getQuizVersionId(), builder.getQuizSessionId(), builder.getAnswers(), builder.getSection(), builder.getPage(), builder.getPerPage(), builder.getFilters());
    }
}
