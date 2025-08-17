package io.constructor.data.model.quiz;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jt\u0010%\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006-"}, d2 = {"Lio/constructor/data/model/quiz/QuizQuestion;", "Ljava/io/Serializable;", PreferencesHelper.PREF_ID, "", "title", "", "description", "type", "ctaText", "images", "Lio/constructor/data/model/quiz/QuizImages;", "options", "", "Lio/constructor/data/model/quiz/QuizOption;", "inputPlaceholder", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/constructor/data/model/quiz/QuizImages;Ljava/util/List;Ljava/lang/String;)V", "getCtaText", "()Ljava/lang/String;", "getDescription", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImages", "()Lio/constructor/data/model/quiz/QuizImages;", "getInputPlaceholder", "getOptions", "()Ljava/util/List;", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/constructor/data/model/quiz/QuizImages;Ljava/util/List;Ljava/lang/String;)Lio/constructor/data/model/quiz/QuizQuestion;", "equals", "", "other", "", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class QuizQuestion implements Serializable {
    private final String ctaText;
    private final String description;
    private final Integer id;
    private final QuizImages images;
    private final String inputPlaceholder;
    private final List<QuizOption> options;
    private final String title;
    private final String type;

    public static /* synthetic */ QuizQuestion copy$default(QuizQuestion quizQuestion, Integer num, String str, String str2, String str3, String str4, QuizImages quizImages, List list, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = quizQuestion.id;
        }
        if ((i10 & 2) != 0) {
            str = quizQuestion.title;
        }
        if ((i10 & 4) != 0) {
            str2 = quizQuestion.description;
        }
        if ((i10 & 8) != 0) {
            str3 = quizQuestion.type;
        }
        if ((i10 & 16) != 0) {
            str4 = quizQuestion.ctaText;
        }
        if ((i10 & 32) != 0) {
            quizImages = quizQuestion.images;
        }
        if ((i10 & 64) != 0) {
            list = quizQuestion.options;
        }
        if ((i10 & 128) != 0) {
            str5 = quizQuestion.inputPlaceholder;
        }
        List list2 = list;
        String str6 = str5;
        String str7 = str4;
        QuizImages quizImages2 = quizImages;
        return quizQuestion.copy(num, str, str2, str3, str7, quizImages2, list2, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* renamed from: component6, reason: from getter */
    public final QuizImages getImages() {
        return this.images;
    }

    public final List<QuizOption> component7() {
        return this.options;
    }

    /* renamed from: component8, reason: from getter */
    public final String getInputPlaceholder() {
        return this.inputPlaceholder;
    }

    public final QuizQuestion copy(@g(name = PreferencesHelper.PREF_ID) Integer id2, @g(name = "title") String title, @g(name = "description") String description, @g(name = "type") String type, @g(name = "cta_text") String ctaText, @g(name = "images") QuizImages images, @g(name = "options") List<QuizOption> options, @g(name = "input_placeholder") String inputPlaceholder) {
        return new QuizQuestion(id2, title, description, type, ctaText, images, options, inputPlaceholder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizQuestion)) {
            return false;
        }
        QuizQuestion quizQuestion = (QuizQuestion) other;
        return Intrinsics.e(this.id, quizQuestion.id) && Intrinsics.e(this.title, quizQuestion.title) && Intrinsics.e(this.description, quizQuestion.description) && Intrinsics.e(this.type, quizQuestion.type) && Intrinsics.e(this.ctaText, quizQuestion.ctaText) && Intrinsics.e(this.images, quizQuestion.images) && Intrinsics.e(this.options, quizQuestion.options) && Intrinsics.e(this.inputPlaceholder, quizQuestion.inputPlaceholder);
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ctaText;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        QuizImages quizImages = this.images;
        int iHashCode6 = (iHashCode5 + (quizImages == null ? 0 : quizImages.hashCode())) * 31;
        List<QuizOption> list = this.options;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.inputPlaceholder;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "QuizQuestion(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", type=" + this.type + ", ctaText=" + this.ctaText + ", images=" + this.images + ", options=" + this.options + ", inputPlaceholder=" + this.inputPlaceholder + ")";
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getId() {
        return this.id;
    }

    public final QuizImages getImages() {
        return this.images;
    }

    public final String getInputPlaceholder() {
        return this.inputPlaceholder;
    }

    public final List<QuizOption> getOptions() {
        return this.options;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public QuizQuestion(@g(name = PreferencesHelper.PREF_ID) Integer num, @g(name = "title") String str, @g(name = "description") String str2, @g(name = "type") String str3, @g(name = "cta_text") String str4, @g(name = "images") QuizImages quizImages, @g(name = "options") List<QuizOption> list, @g(name = "input_placeholder") String str5) {
        this.id = num;
        this.title = str;
        this.description = str2;
        this.type = str3;
        this.ctaText = str4;
        this.images = quizImages;
        this.options = list;
        this.inputPlaceholder = str5;
    }
}
