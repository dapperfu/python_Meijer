package io.constructor.data.model.quiz;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lio/constructor/data/model/quiz/QuizOption;", "Ljava/io/Serializable;", PreferencesHelper.PREF_ID, "", "value", "", "attribute", "Lio/constructor/data/model/quiz/QuizOptionAttribute;", "images", "Lio/constructor/data/model/quiz/QuizImages;", "(Ljava/lang/Integer;Ljava/lang/String;Lio/constructor/data/model/quiz/QuizOptionAttribute;Lio/constructor/data/model/quiz/QuizImages;)V", "getAttribute", "()Lio/constructor/data/model/quiz/QuizOptionAttribute;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImages", "()Lio/constructor/data/model/quiz/QuizImages;", "getValue", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lio/constructor/data/model/quiz/QuizOptionAttribute;Lio/constructor/data/model/quiz/QuizImages;)Lio/constructor/data/model/quiz/QuizOption;", "equals", "", "other", "", "hashCode", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class QuizOption implements Serializable {
    private final QuizOptionAttribute attribute;
    private final Integer id;
    private final QuizImages images;
    private final String value;

    public static /* synthetic */ QuizOption copy$default(QuizOption quizOption, Integer num, String str, QuizOptionAttribute quizOptionAttribute, QuizImages quizImages, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = quizOption.id;
        }
        if ((i10 & 2) != 0) {
            str = quizOption.value;
        }
        if ((i10 & 4) != 0) {
            quizOptionAttribute = quizOption.attribute;
        }
        if ((i10 & 8) != 0) {
            quizImages = quizOption.images;
        }
        return quizOption.copy(num, str, quizOptionAttribute, quizImages);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final QuizOptionAttribute getAttribute() {
        return this.attribute;
    }

    /* renamed from: component4, reason: from getter */
    public final QuizImages getImages() {
        return this.images;
    }

    public final QuizOption copy(@g(name = PreferencesHelper.PREF_ID) Integer id2, @g(name = "value") String value, @g(name = "attribute") QuizOptionAttribute attribute, @g(name = "images") QuizImages images) {
        return new QuizOption(id2, value, attribute, images);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuizOption)) {
            return false;
        }
        QuizOption quizOption = (QuizOption) other;
        return Intrinsics.e(this.id, quizOption.id) && Intrinsics.e(this.value, quizOption.value) && Intrinsics.e(this.attribute, quizOption.attribute) && Intrinsics.e(this.images, quizOption.images);
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        QuizOptionAttribute quizOptionAttribute = this.attribute;
        int iHashCode3 = (iHashCode2 + (quizOptionAttribute == null ? 0 : quizOptionAttribute.hashCode())) * 31;
        QuizImages quizImages = this.images;
        return iHashCode3 + (quizImages != null ? quizImages.hashCode() : 0);
    }

    public String toString() {
        return "QuizOption(id=" + this.id + ", value=" + this.value + ", attribute=" + this.attribute + ", images=" + this.images + ")";
    }

    public final QuizOptionAttribute getAttribute() {
        return this.attribute;
    }

    public final Integer getId() {
        return this.id;
    }

    public final QuizImages getImages() {
        return this.images;
    }

    public final String getValue() {
        return this.value;
    }

    public QuizOption(@g(name = PreferencesHelper.PREF_ID) Integer num, @g(name = "value") String str, @g(name = "attribute") QuizOptionAttribute quizOptionAttribute, @g(name = "images") QuizImages quizImages) {
        this.id = num;
        this.value = str;
        this.attribute = quizOptionAttribute;
        this.images = quizImages;
    }
}
