package io.constructor.data.remote;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lio/constructor/data/remote/ApiPaths;", "", "()V", "URL_AUTOCOMPLETE", "", "URL_AUTOCOMPLETE_SELECT_EVENT", "URL_BEHAVIOR", "URL_BEHAVIORAL_SEARCH_REGEX", "URL_BEHAVIORAL_V1_PREFIX", "URL_BEHAVIORAL_V2_PREFIX", "URL_BROWSE", "URL_BROWSE_FACETS", "URL_BROWSE_FACET_OPTIONS", "URL_BROWSE_GROUPS", "URL_BROWSE_ITEMS", "URL_BROWSE_RESULT_CLICK_EVENT", "URL_BROWSE_RESULT_LOAD_EVENT", "URL_CONVERSION_EVENT", "URL_ITEM_DETAIL_LOAD_EVENT", "URL_PURCHASE", "URL_QUIZ_CONVERSION_EVENT", "URL_QUIZ_NEXT_QUESTION", "URL_QUIZ_RESULTS", "URL_QUIZ_RESULT_CLICK_EVENT", "URL_QUIZ_RESULT_LOAD_EVENT", "URL_RECOMMENDATIONS", "URL_RECOMMENDATION_RESULT_CLICK_EVENT", "URL_RECOMMENDATION_RESULT_VIEW_EVENT", "URL_RESULT_CLICK_EVENT", "URL_SEARCH", "URL_SEARCH_RESULT_CLICK_EVENT", "URL_SEARCH_SUBMIT_EVENT", "URL_SESSION_START_EVENT", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class ApiPaths {
    public static final ApiPaths INSTANCE = new ApiPaths();
    public static final String URL_AUTOCOMPLETE = "autocomplete/%s";
    public static final String URL_AUTOCOMPLETE_SELECT_EVENT = "autocomplete/{term}/select";
    public static final String URL_BEHAVIOR = "behavior";
    public static final String URL_BEHAVIORAL_SEARCH_REGEX = "/autocomplete/.*/(search|select|click_through)$";
    public static final String URL_BEHAVIORAL_V1_PREFIX = "/behavior";
    public static final String URL_BEHAVIORAL_V2_PREFIX = "/v2/behavioral_action";
    public static final String URL_BROWSE = "browse/%s/%s";
    public static final String URL_BROWSE_FACETS = "browse/facets";
    public static final String URL_BROWSE_FACET_OPTIONS = "browse/facet_options";
    public static final String URL_BROWSE_GROUPS = "browse/groups";
    public static final String URL_BROWSE_ITEMS = "browse/items";
    public static final String URL_BROWSE_RESULT_CLICK_EVENT = "v2/behavioral_action/browse_result_click";
    public static final String URL_BROWSE_RESULT_LOAD_EVENT = "v2/behavioral_action/browse_result_load";
    public static final String URL_CONVERSION_EVENT = "v2/behavioral_action/conversion";
    public static final String URL_ITEM_DETAIL_LOAD_EVENT = "v2/behavioral_action/item_detail_load";
    public static final String URL_PURCHASE = "v2/behavioral_action/purchase";
    public static final String URL_QUIZ_CONVERSION_EVENT = "v2/behavioral_action/quiz_conversion";
    public static final String URL_QUIZ_NEXT_QUESTION = "v1/quizzes/%s/next";
    public static final String URL_QUIZ_RESULTS = "v1/quizzes/%s/results";
    public static final String URL_QUIZ_RESULT_CLICK_EVENT = "v2/behavioral_action/quiz_result_click";
    public static final String URL_QUIZ_RESULT_LOAD_EVENT = "v2/behavioral_action/quiz_result_load";
    public static final String URL_RECOMMENDATIONS = "recommendations/v1/pods/%s";
    public static final String URL_RECOMMENDATION_RESULT_CLICK_EVENT = "v2/behavioral_action/recommendation_result_click";
    public static final String URL_RECOMMENDATION_RESULT_VIEW_EVENT = "v2/behavioral_action/recommendation_result_view";
    public static final String URL_RESULT_CLICK_EVENT = "v2/behavioral_action/result_click";
    public static final String URL_SEARCH = "search/%s";
    public static final String URL_SEARCH_RESULT_CLICK_EVENT = "autocomplete/{term}/click_through";
    public static final String URL_SEARCH_SUBMIT_EVENT = "autocomplete/{term}/search";
    public static final String URL_SESSION_START_EVENT = "behavior";

    private ApiPaths() {
    }
}
