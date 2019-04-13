package com.lattice.constants;

/*
 * DBconstants mostly contains all the database column names mentioned in entities.
 */

public class DBconstants {

  // Threads
  public static final String COLUMN_DESCRIPTION = "description";
  public static final String TABLE_THREAD_MASTER = "thread_master";
  public static final String COLUMN_THREAD_NAME = "thread_name";
  public static final String COLUMN_THREAD_ID = "thread_id";
  public static final String COLUMN_THREAD_STATUS = "thread_status";
  public static final String COLUMN_THREAD_CREATED_BY = "created_by";
  public static final String COLUMN_THREAD_ACTION = "action";
  public static final String COLUMN_THREAD_MODE = "mode";
  public static final String ACTION_COL_DEFINITION = "tinyint(1) default 1 COMMENT '0:Approve, 1:Reject'";
  public static final char THREAD_PREFIX = 'T';

  // Tags
  public static final String TABLE_TAG_MASTER = "tag_master";

  public static final String TABLE_TAG_MAP_REPLY = "tag_map_reply";
  public static final String TABLE_TAG_MAP_THREAD = "tag_map_thread";
  public static final String TABLE_TAG_MAP_RESPONSE = "tag_map_response";
  public static final String COLUMN_TAG_ID = "tag_id";
  public static final String COLUMN_TAG_NAME = "tag_name";

  // Member
  public static final String TABLE_THREAD_MEMBER_DETAILS = "thread_member_details";
  public static final String COLUMN_THREAD_MEMBER_ID = "thread_member_id";
  public static final String TABLE_SESSION_MEMBER_DETAILS = "p2p_session_member_details";
  public static final String SESSION_MEMBER_TYPE_COL_DEFINITION = "tinyint(1) default 1 COMMENT ' 0:Group 1:Customized '";
  public static final String THREAD_MEMBER_TYPE_COL_DEFINITION = "tinyint(1) default 1 COMMENT '0:All  1:Group 2:Customized '";
  public static final String COLUMN_MEMBER_ID = "member_id";
  public static final String COLUMN_MEMBER_TYPE = "member_type";

  // Thread Member Map Group
  public static final String TABLE_THREAD_MEMBER_MAP_GROUP = "thread_member_map_group";
  public static final String COLUMN_THREAD_MEMBER_GROUP_ID = "thread_member_group_id";
  public static final String TABLE_SESSION_MEMBER_MAP_GROUP = "p2p_session_member_map_group";
  public static final String COLUMN_SESSION_MEMBER_GROUP_ID = "session_member_group_id";

  // Thread Member Map User
  public static final String TABLE_THREAD_MEMBER_MAP_USER = "thread_member_map_user";
  public static final String COLUMN_THREAD_MEMBER_USER_ID = "thread_member_user_id";
  public static final String TABLE_SESSION_MEMBER_MAP_USER = "p2p_session_member_map_user";
  public static final String COLUMN_SESSION_MEMBER_USER_ID = "session_member_user_id";

  // Customized details
  public static final String TABLE_SESSION_CUSTOMIZED_DETAILS = "session_cust_details";
  public static final String COLUMN_EMPLOYEE_ID = "employee_id";
  public static final String COLUMN_NAME = "name";
  public static final String TABLE_THREAD_CUSTOMIZED_DETAILS = "thread_cust_details";

  // Common
  public static final String CREATED_ON = "created_on";
  public static final String MODE_COL_DEFINITION = "tinyint(1) default 1 COMMENT '0:Draft, 1:Publish'";

  // file
  public static final String TABLE_FILE_MAP_RESPONSE = "file_map_response";
  public static final String COLUMN_FILE_MAP_RES_ID = "file_map_res";
  public static final String TABLE_FILE_MAP_THREAD = "file_map_thread";
  public static final String COLUMN_FILE_MAP_THREAD_ID = "file_map_thread";
  public static final String COLUMN_FILE_NAME = "file_name";

  // response
  public static final String TABLE_RESPONSE_MASTER = "response_master";
  public static final String COLUMN_RESPONSE_ID = "response_id";
  public static final String COLUMN_POST_DATE = "post_date";
  public static final String COLUMN_RESPONSE_DESCRIPTION = "description";

  // reply
  public static final String TABLE_REPLY = "reply";
  public static final String COLUMN_REPLY_ID = "reply_id";
  public static final String COLUMN_REPLY_MESSAGE = "message";

  // spam
  public static final String TABLE_SPAM = "spam_master";
  public static final String COLUMN_SPAM_ID = "spam_id";
  public static final String COLUMN_NOTES = "notes";

  // spam
  public static final String TABLE_NOTES = "notes_master";
  public static final String COLUMN_NOTES_ID = "notes_id";

  // session
  public static final String TABLE_SESSION_MASTER = "session_master";
  public static final String TABLE_P2P_SESSION_MASTER = "p2p_session_master";
  public static final String COLUMN_SESSION_ID = "session_id";
  public static final String COLUMN_SESSION_TIME = "session_time";
  public static final String COLUMN_SESSION_DATE = "session_date";
  public static final String COLUMN_SESSION_CATEGORY = "session_category";
  public static final String CATEGORY_COL_DEFINITION = "tinyint(1) default 1 COMMENT '0:Previous, 1:Upcoming'";
  public static final String SESSION_PREFIX = null;
  public static final String COLUMN_SESSION_MEMBER_ID = "session_member_id";

  // supervisor
  public static final String TABLE_SUPERVISOR = "supervisor";
  public static final String COLUMN_SUPERVISOR_ID = "supervisor_id";
  public static final String COLUMN_SUPERVISOR_NAME = "supervisor_name";

  // presenter
  public static final String TABLE_PRESENTER = "presenter";
  public static final String COLUMN_PRESENTER_ID = "presenter_id";
  public static final String COLUMN_PRESENTER_NAME = "presenter_name";

  // previousSession
  public static final String TABLE_PREVIOUS_SESSION = "previous_session";
  public static final String COLUMN_PREV_SESSION_ID = "prev_session_id";
  public static final String COLUMN_ATTENDED = "attended";
  public static final String ATTENDED_COL_DEFINITION = "tinyint(1) default 1 COMMENT '0:No, 1:Yes'";

  // assessments
  public static final String TABLE_ASSESSMENT = "assessment";
  public static final String COLUMN_ASSESSMENT_ID = "assessment_id";
  public static final String COLUMN_ASSESSMENT_NAME = "assessment_name";
  public static final String STATUS_COL_DEFINITION = "tinyint(1) default 1 COMMENT '0:DONE, 1:FLAG'";

  public static final String CREATED_BY = "created_by";
  public static final String STATUS = "status";
  public static final String MODIFIED_ON = "modified_on";
  public static final String MODIFIED_BY = "modified_by";

  // PROGRAM
  public static final String PROGRAM_CODE = "program_code";
  public static final String PROGRAM_URL = "program_url";
  public static final String PROGRAM_MASTER = "program_master";
  public static final String PROGRAM_ID = "program_id";
  public static final String PROGRAM_NAME = "program_name";

  // Email Notifications
  public static final String SMS_NOTIFICATIONS = "sms_notifications";
  // SYSTEM PERMISSIONSS
  public static final String PERMISSION_ID = "permission_id";
  public static final String ACTION = "action";
  public static final String API_PATH = "api_path";
  public static final String USER_TYPE = "user_type";
  public static final String SYSTEM_PERMISSIONS = "system_permissions";

  // GROUP
  public static final String GROUP_DETAILS = "group_details";
  public static final String GROUP_NAME = "group_name";
  public static final String GROUP_ID = "group_id";
  public static final String GROUP_MEMBER_DETAILS = "group_member_details";
  public static final String GROUP_MEMBER_ID = "group_member_id";
  public static final String IS_LEADER = "is_leader";
  public static final String IS_DELETED = "is_deleted";
  public static final String IS_DISABLED = "is_disabled";
  public static final String APPROVED_ON = "approved_on";
  public static final String APPROVED_BY = "approved_by";

  // PATIENT
  public static final String GUARDIAN_NAME = "guardian_name";
  public static final String AGE = "age";
  public static final String PATIENT_ID = "patient_id";
  public static final String TRIAL_ID = "trial_id";
  public static final String CLINICIAN_NAME = "clinician_name";
  public static final String CLINICIAN_CONTACT = "clinician_contact";
  public static final String IS_TERMINATED = "is_terminated";

  // PATIENT INTERVENSION MAP
  public static final String PATIENT_INTERVENSION_MAP = "patient_intervention_map";

  // ROLE
  public static final String ROLE_MASTER = "role_master";
  public static final String ROLE_ID = "role_id";
  public static final String ROLE_NAME = "role_name";
  public static final String IS_CLINICIAN = "is_clinician";

  // INTERVENTIONS
  public static final String TABLE_INTERVENTION_MASTER = "intervention_master";
  public static final String COLUMN_INTERVENTION_ID = "inter_id";
  public static final String COLUMN_INTERVENTION_NAME = "name";
  public static final String COLUMN_INTERVENTION_START_DATE = "start_date";
  public static final String COLUMN_INTERVENTION_TYPE = "type";
  public static final String INTERVENTION_PREFIX = "INT";
  public static final String PAT_INT_MAP = "pat_int_map";
  public static final String INTERVENTION = "intervention";

  // FORMS
  public static final String TABLE_FORM_MASTER = "form_master";
  public static final String COLUMN_FORM_NAME = "form_name";
  public static final String COLUMN_FORM_ID = "form_id";
  public static final String COLUMN_IS_ACTIVE = "is_active";
  public static final String COLUMN_FORM_STATUS = "form_status";
  public static final String COLUMN_OPERATOR = "operator";
  public static final String COLUMN_CREATED_BY = "created_by";
  public static final String COLUMN_LANGUAGE = "language";
  public static final String COLUMN_IS_COMPLETED = "is_completed";
  public static final String COLUMN_IS_MANDATORY = "is_mandatory";
  public static final String COLUMN_START_QUESTION = "start_question";
  public static final String COLUMN_ENGLISH = "english";
  public static final String COLUMN_HINDI = "hindi";
  public static final String COLUMN_KONKANI = "konkani";
  public static final char FORM_PREFIX = 'F';
  public static final String UPDATED_ON = "updated_on";

  // FORM LANGUAGE
  public static final String TABLE_FORM_LANGUAGE = "form_language";
  public static final String COLUMN_FORM_LANGUAGE_ID = "form_lang_id";
  public static final String COLUMN_FORM_LANGUAGE_DESC = "form_lang_desc";

  // FORM QUESTIONS
  public static final String TABLE_FORM_QUESTION_MASTER = "form_question_master";
  public static final String COLUMN_QUESTION_ID = "question_id";
  public static final String COLUMN_QUESTION_MODE = "question_mode";
  public static final String COLUMN_QUESTION_OPERATOR = "question_operator";
  public static final String COLUMN_QUESTION_TYPE = "question_type";
  public static final String COLUMN_QUESTION_SEQUENCE_NUMBER = "next_que";
  public static final String COLUMN_IS_REQUIRED = "is_required";
  public static final String COLUMN_IS_SCORABLE = "is_scorable";
  public static final String COLUMN_QUESTION_IMAGE_ID = "que_img_id";
  public static final String COLUMN_IMAGE_URI = "img_uri";
  public static final String COLUMN_HAS_IMAGE = "has_image";
  public static final String COLUMN_OPTION_TYPE = "opt_type";

  // FORM QUESTION DESCRIPTION
  public static final String TABLE_FORM_QUESTION_DESC = "form_question_desc";
  public static final String COLUMN_QUESTION_DESC_ID = "que_desc_id";
  public static final String COLUMN_QUESTION_DESC = "que_desc";
  public static final String COLUMN_QUESTION_HINT = "que_hint";
  public static final String LANGUAGE_TYPE = "tinyint(2) COMMENT '1:english, 2:hindi, 3:konkani'";
  public static final String COL_TYPE = "text";

  // FORM QUESTION OPTIONS
  public static final String TABLE_FORM_QUESTION_OPTIONS = "form_question_options";
  public static final String COLUMN_OPTION_ID = "option_id";
  public static final String COLUMN_OPTION_SCORE = "option_score";
  public static final String COLUMN_OPTION_SEQUENCE_NUMBER = "opt_no";

  // FORM QUESTION OPTIONS DESC
  public static final String TABLE_FORM_QUESTION_OPTIONS_DESC = "form_question_options_desc";
  public static final String COLUMN_OPTION_DESC_ID = "opt_desc_id";
  public static final String COLUMN_OPTION_DESC = "option_desc";

  // FORM QUESTION OPTIONS GRID
  public static final String TABLE_FORM_QUESTION_OPTIONS_GRID = "form_ques_options_grid";
  public static final String COLUMN_GRID_ID = "grid_id";
  public static final String COLUMN_GRID_VALUE = "value";
  public static final String COLUMN_GRID_INDEX_VALUE = "index_no";
  public static final String GRID_OPT_COL_MAP = "grid_opt_col_map";
  public static final String GRID_OPT_ROW_MAP = "grid_opt_row_map";
  public static final String COLUMN_GRID_COLUMN_ID = "col_id";
  public static final String COLUMN_GRID_ROW_ID = "row_id";
  public static final String GRID_OPT_ROW_DESC = "grid_opt_row_desc";
  public static final String COLUMN_GRID_ROW_DESC_ID = "row_desc_id";
  public static final String GRID_OPT_COL_DESC = "grid_opt_col_desc";
  public static final String COLUMN_GRID_COL_DESC_ID = "col_desc_id";

  // FORM QUESTION OPTIONS LINEAR SCALE
  public static final String TABLE_FORM_QUESTION_OPTIONS_LINEAR_SCALE = "form_ques_options_lin_scale";
  public static final String COLUMN_LINEAR_SCALE_ID = "lin_scale_id";
  public static final String COLUMN_MIN = "min";
  public static final String COLUMN_MAX = "max";

  // FORM QUESTION ANSWERS
  public static final String TABLE_FORM_ANSWERS = "form_answers";
  public static final String COLUMN_ANSWER_ID = "answer_id";
  public static final String COLUMN_ANSWER_DESC = "answer_desc";

  // PATIENT DETAILS
  public static final String TABLE_PATIENT_DETAILS = "patient_details";
  public static final String COLUMN_PATIENT_ID = "patient_id";
  public static final String PATIENT_NAME = "patient_name";

  // FORM ANSWER FILE
  public static final String TABLE_FORM_QUESTION_FILE = "form_question_file";
  public static final String COLUMN_ANSWER_FILE = "answer_file";
  public static final String COLUMN_FILE_ID = "file_id";

  // FORM QUESTION ANSWERS LINEAR SCALE
  public static final String TABLE_FORM_ANSWER_LINEAR_SCALE = "form_answer_linear_scale";
  public static final String COLUMN_LINEAR_SCALE_ANSWER_ID = "ls_ans_id";
  public static final String COLUMN_LINEAR_SCALE_ANSWER_VALUE = "ls_ans_value";

  // PATIENT RESPONSE
  public static final String TABLE_PATIENT_RESPONSE = "patient_response";
  public static final String COLUMN_SCORE = "score";

  // FORM SCORE
  public static final String TABLE_FORM_SCORE = "form_score";
  public static final String COLUMN_FORM_SCORE_ID = "form_score_id";
  public static final String COLUMN_FORM_SCORE = "form_score";

  // FORM NEXT QUESTION
  public static final String TABLE_FORM_NEXT_QUESTION = "form_next_question";
  public static final String COLUMN_NEXT_QUESTION_ID = "next_que_id";
  public static final String COLUMN_FIXED_VALUE = "fixed_value";
  public static final String OPERATOR_COL_DEFINITION = "tinyint(2) COMMENT '1:ADD, "
      + "2:SUBTRACT, 3:IGNORE, 4:EQUALS'";

  // NEXT SESSION
  public static final String TABLE_NEXT_SESSION_DETAILS = "next_session_details";
  public static final String COLUMN_NEXT_SESSION_ID = "next_ses_id";
  public static final String COLUMN_NEXT_SES = "next_ses";

  public static final String TABLE_OPT_IMG_MAP = "opt_img_map";
  public static final String COLUMN_OPT_IMG_MAP_ID = "opt_img_map_id";

  public static final String TABLE_QUE_IMG_MAP = "que_img_map";
  public static final String COLUMN_QUE_IMG_MAP_ID = "que_img_map_id";

  public static final String COLUMN_SES_ID = "ses_id";
  public static final String COLUMN_IS_FLAGGED = "is_flagged";
  public static final String SESSION_DATE = "session_date";
  public static final String SESSION_NOTE = "session_note";
  public static final String COLUMN_SESSION_NO = "session_no";
  public static final String COLUMN_FORMULA = "formula";

  public static final String TABLE_SESSION_FORM_MAP = "session_form_map";
  public static final String COLUMN_SESSION_FORM_ID = "ses_form_id";
  public static final String COLUMN_FIXED_MIN_VALUE = "fixed_min_value";
  public static final String COLUMN_FIXED_MAX_VALUE = "fixed_max_value";
  public static final String COLUMN_SEQUENCE_NUMBER = "seq_no";

  // REPORT DETAILS
  public static final String TABLE_REPORT_DETAILS = "report_details";
  public static final String COLUMN_REPORT_ID = "report_id";
  public static final String COLUMN_REPORT_TITLE = "title";
  public static final String REPORT = "report";
  public static final char REPORT_PREFIX = 'R';
  public static final String TABLE_REPORT_MAP_TRIALID = "report_map_trialId";

  // REPORT TYPE
  public static final String TABLE_REPORT_TYPE = "report_type";
  public static final String COLUMN_REPORT_TYPE_ID = "type_id";
  public static final String COLUMN_REPORT_TYPE = "type";

  // EMR
  public static final String SHARED_EMR_DETAILS = "shared_emr_details";
  public static final String SHARED_EMR_ID = "shared_emr_id";
  public static final String SHARED_BY_NAME = "shared_by_name";
  public static final String SHARED_TO_NAME = "shared_to_name";
  public static final String SHARED_TO_CONTACT = "shared_to_contact";
  public static final String SHARED_ON = "shared_on";
  public static final String SHARED_BY_ID = "shared_by_id";
  public static final String SHARED_TO_ID = "shared_to_id";
  public static final String PUBLISHED_ON = "published_on";
  public static final String SHARED_TO_PHONE_CODE = "shared_to_phone_code";

  // USER
  public static final String USER_MASTER = "user_master";
  public static final String USER_ID = "user_id";
  public static final String PREFIX = "prefix";
  public static final String FIRST_NAME = "first_name";
  public static final String LAST_NAME = "last_name";
  public static final String EMAIL = "email";
  public static final String GENDER = "gender";
  public static final String DOB = "dob";
  public static final String ADDRESS1 = "address1";
  public static final String ADDRESS2 = "address2";
  public static final String CITY = "city";
  public static final String STATE = "state";
  public static final String PINCODE = "pincode";
  public static final String CONTACT = "contact";
  public static final String IS_ACTIVE = "is_active";
  public static final String IS_VERIFIED = "is_verified";
  // public static final String CREATED_BY = "created_by";
  public static final String CREATOR_TYPE = "creator_type";
  // public static final String MODIFIED_BY = "modified_by";
  // pu//blic static final String CREATED_ON = "created_on";
  public static final String MODIFIER_TYPE = "modifier_type";
  // public static final String MODIFIED_ON = "modified_on";
  public static final String PHONE_CODE = "phone_code";
  public static final String PASSWORD = "password";
  public static final String PREVIOUS_PASSWORD = "previous_password";
  public static final String OTP = "OTP";
  public static final String PERMISSIONS = "permissions";
  public static final String FULL_NAME = "full_name";
  public static final String REJECT_NOTE = "reject_note";
  // public static final String STATUS = "status";
  public static final String IS_ENABLED = "is_enabled";
  public static final String USER_ROLE = "user_role";
  public static final String ASSIGNEE_ROLE_NAME = "assignee_role_name";
  public static final String ASSIGNEE_EMAIL = "assignee_email";
  public static final String USERNAME = "username";
  public static final String ASSIGNEE_NAME = "assignee_name";
  public static final String USER_DETAILS = "user_details";
  public static final String ASSIGNEE_CONTACT = "assignee_contact";
  public static final String PENDING_ACTION = "Pending Action";
  public static final String ACTIVE = "Active";
  public static final String INACTIVE = "Inactive";
  public static final String APPROVED = "Approved";

  // USER PROGRAM ROLE MAP
  public static final String ASSIGNEE_ID = "assignee_id";
  public static final String ASSIGNEE_ROLE = "assignee_role";
  public static final String ASSIGNEE_ROLE_ID = "assignee_role_ID";
  public static final String USER_PROGRAM_ROLE_MAP = "user_program_role_map";
  public static final String USER_PROG_ROLE_ID = "user_prog_role_id";
  public static final String IS_APPROVED = "is_approved";
  public static final String ASSIGNEE_PHONE_CODE = "assignee_phone_code";

  // ROLE
  public static final String IS_SPAM = "is_spam";
  public static final String COLUMN_REJECT_NOTES = "reject_note";

  // Email Notifications
  public static final String EXTERNAL_EMAIL_NOTIFICATIONS = "external_email_notifications";
  public static final String ID = "id";
  public static final String BODY = "body";
  public static final String NOTIF_ID = "notif_id";
  public static final String SUBJECT = "subject";

  // template
  public static final String TABLE_TEMPLATE_MASTER = "template_master";
  public static final String COLUMN_TEMPLATE_ID = "template_id";
  public static final String COLUMN_MESSAGE = "message";
  public static final String COLUMN_SUBJECT = "subject";
  public static final String COLUMN_TYPE = "type";
  public static final String COLUMN_TEMPLATE_NAME = "template_name";

  
}
