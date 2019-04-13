package com.lattice.constants;

import java.util.Collection;

import io.jsonwebtoken.Header;

/*
 * ApiConstants contains the elements mentioned in services, controllers and other parts 
 * related to APIs
 */

public class ApiConstants {

  // CONTENT TYPE
  public static final String REST_JSON_CONTENT_TYPE = "application/json";

  // REST END POINTS
  public static final String REST_FORM_PATH = "/forms";
  public static final String REST_PATIENT_PATH = "/patients";
  public static final String REST_FORM_PUBLISH_PARAM = "/publish/{formId}";
  public static final String REST_QUESTION_PATH = "/questions";
  public static final String REST_OPTION_PATH = "/options";
  public static final String REST_FORM_ID_PARAM = "/{formId}";
  public static final String REST_FILE_PATH = "/files";
  public static final String REST_INTERVENTION_PATH = "/interventions";
  public static final String REST_SESSION_PATH = "/sessions";
  public static final String FORMS_NOT_FOUND = "Forms not found";
  public static final String FORM_NOT_FOUND = "Form not found";
  public static final String APPLICANTS_NOT_FOUND = "Applicants not found";
  public static final String REST_BASE_PATH = "/Sangath";
  public static final String AUTHENTICATE_USERS = "/authenticate_users";
  public static final String REST_REGISTER_USER = "/register_user";
  public static final String ROLE = "/role";
  public static final String PROGRAM = "/programs";
  public static final String REST_FORGOT_PASSWORD = "/forgot_password";
  public static final String REST_RESET_PASSWORD = "/reset_password";
  public static final String REST_CREATE_USER = "/create_user";
  public static final String REST_USER_PATH = "/users";
  public static final String REST_USER_ID_PARAM = "/{userId}";
  public static final String REST_DISABLE_USER = "/enable_disable_user";
  public static final String REST_DISABLE_PROGRAM_USER = "/disable_program_user";
  public static final String REST_APPROVE_REJECT_USER = "/approve_reject_user";
  public static final String REST_CHANGE_PASSWORD = "/change_password";
  public static final String REST_GROUPS = "/groups";
  public static final String REST_CREATE_GROUP = "/create_group";
  public static final String REST_GROUP_ID_PARAM = "/{groupId}";
  public static final String REST_DISABLE_GROUP = "/enable_disable_group";
  public static final String REST_DELETE_GROUP = "/delete_group";
  public static final String REST_PROGRAM_ID_PARAM = "/{programId}";
  public static final String REST_SUPERVISOR_DROPDOWN = "/supervisor_dropdown";
  public static final String REST_MEMBER_DROPDOWN = "/member_dropdown";
  public static final String LIST = "/list";
  public static final String REST_USER_LIST = "/user_list";
  public static final String REST_CREATE_PATIENT = "/create_patient";
  public static final String CREATE_MOBILE_PATIENT = "/create_mobile_patient";
  public static final String UPDATE_MOBILE_PATIENT = "/update_mobile_patient";
  public static final String REST_UPDATE_PATIENT = "/update_patient";
  public static final String REST_ALL_USERS = "/all_users";
  public static final String REST_PATIENT_ID_PARAM = "/{patientId}";
  public static final String REST_PATIENT_LIST = "/patient_list";
  public static final String CHECK_USER_REMOVAL = "/check_user_removal";
  public static final String REST_INTERVENTION_ID_PARAM = "/{interId}";
  public static final String REST_IDS_PARAM = "/ids";
  public static final String REST_REPORT_PATH = "/reports";
  public static final String REST_PATIENT = "/patient";
  public static final String REST_DASHBOARD = "/dashboard";
  public static final String REST_MY_PROFILE = "/my_profile";
  public static final String REST_MY_INTERVENTIONS = "/my_interventions";
  public static final String REST_SHARE_EMR = "/share_emr";
  public static final String REST_SHARED_EMR_DETAILS = "/shared_emr_details";
  public static final String REST_REVOKE_SHARED_EMR_DETAILS = "/revoke_shared_emr_details";
  public static final String REST_SHARED_EMR_LIST = "/shared_emr_list";
  public static final String REST_COUNSELOR_LIST = "/counselor_list";
  public static final String REST_SENIORCOUNSELOR_LIST = "/seniorcounselor_list";
  public static final String REST_TRANSFER_PATIENT = "/transfer_patient";
  public static final String REST_USER_LOGIN = "/user_login";
  public static final String REST_MY_SCHEDULE = "/my_schedule";
  public static final String REST_EDIT_PROFILE = "/edit_profile";
  public static final String MOBILE_MY_SCHEDULE = "/my_mobile_schedule";
  public static final String USERS_LOGIN = "/users_login";
  public static final String REST_APPROVE_REJECT_USER_ROLE = "/approve_reject_user_role";
  public static final String REST_ASSIGNEE_DROPDOWN = "/assignee_dropdown";
  public static final String REST_SMS = "/sms";
  public static final String REST_SUPERVISOR_LIST = "/program_supervisors_list";
  public static final String REST_PROGRAM_SCOUNSELOR_LIST = "/program_seniorcounselors_list";
  public static final String REST_PROGRAM_COUNSELOR_LIST = "/program_counselors_list";
  public static final String REST_TRANSFER_DETAILS = "/transfer_patient_details";
  public static final String REST_USER_PROGRAM_ROLES = "/user_program_roles";
  public static final String REST_MODERATOR_PATIENT_LIST = "/all_patients";
  public static final String REST_RESET_USER_PASSWORD = "/reset_user_password";
  public static final String REST_THREAD_PATH = "/Thread";
  public static final String REST_TEMPLATE_PATH = "/Template";
  public static final String THREAD_NOT_PUBLISHED = "thread not published";
  public static final String REST_THREAD_ID_PARAM = "/{threadId}";
  public static final String REST_RESPONSE_PATH = "/Response";
  public static final String REST_REPLY_PATH = "/Reply";
  public static final String REST_NOTES_PATH = "/notes";
  public static final String SESSION_STATUS = "/session_status";
  public static final String REST_SESSION_STATUS = "/session_status";
  public static final String REST_MOBILE_USER_DETAILS = "/mobile_user_details";
  public static final String ReportId = "/{reportId}";
  public static final String ALL_REPORT_ID = "all/{reportId}";
  public static final String PROGRAMS = "programs/{programId}";
  public static final String LIST_OF_FORM_IDS = "/formOfSession/{sesId}";
  public static final String QUESTIONS = "/questions/{formId}";
  public static final String GET_INTERVENTION = "/intervention/{intId}";
  public static final String REST_PROGRAM = "/program";
  public static final String REST_TEMPLATE_ID_PARAM = "/{templateId}";
  public static final String ALL = "/all";
  public static final String MOBILE_USERS_LOGIN = "/mobile_users_login";
  public static final String ACTIVE = "/active";
  public static final String PATIENTS = "/patients";
  public static final String SEND_PATIENT_HOMEWORK_SMS = "/send_homework_sms";
  public static final String SESSION_DETAILS = "/session_details";
  public static final String DELETE_MULTIPLE_QUESTIONS ="/deletes_multiple_next_que";
  public static final String REST_TERMINATE_PARAM = "terminate";
  public static final String REASON = "/reason";


  // RESPONSE MESSAGES
  public static final String MESSAGE = "message";
  public static final String ACCEPT = "accept";
  public static final String REJECT = "reject";
  public static final String CREATED_SUCCESSFULLY = " created successfully.";
  public static final String ALREADY_EXISTS = " already exists";
  public static final String LOGIN_SUCCESSFUL = "Login Successful";
  public static final String SUCCESS = "success";
  public static final String BASE_ERROR = "errors";
  public static final String UNAUTHORIZED = "You are not authorized to perform this action.";
  public static final String USERS_LIST = "List Of Users";
  public static final String MY_PROGRAMS = "my_programs";
  public static final String OTHER_PROGRAMS = "other_programs";

  // AUTHENTICATION
  public static final String AUTHORIZATION = "Authorization";
  public static final String VERIFIED = "verified";
  public static final String LOGIN_AS = "login_as";

  // USER TYPES
  public static final String SUPER_ADMIN_ADMIN = "Super Admin/Admin";
  public static final String SUPER_ADMIN = "Super Admin";
  public static final String ADMIN = "Admin";
  public static final String COUNSELOR = "Counselor";
  public static final String SENIORCOUNSELLOR = "Senior Counselor";
  public static final String CONTENTCREATOR = "Content Creator";
  public static final String SUPERVISOR = "Supervisor";
  public static final String TRAINEE = "Trainee";
  public static final String MODERATOR = "Moderator";
  public static final String OTHERS = "Others";
  public static final String MEMBERANDADMIN = "Member and Admin";
  public static final String MEMBER = "Member";

  // AUTHENTICATION
  public static final String EMAIL_NOT_FOUND = "Email not found";
  public static final String WRONG_PASSWORD = "Wrong password";
  public static final String BEARER = "Bearer ";
  public static final String HEADER = "header";

  // SWAGGER DOCUMNETATION
  public static final String USER_LOG_IN = "Users Login";
  public static final String REGISTER_USER = "Register User";
  public static final String PUBLISHED_PROGRAMS_LIST = "List Of Published Programs";
  public static final String FORGOT_PASSWORD = "Forgot Password";
  public static final String RESET_PASSWORD = "Reset Password";
  public static final String CREATE_USER = "Creates A New User";
  public static final String USER_UPDATE = "Updates An User";
  public static final String USERS_DETAILS = "Get Details Of An User";
  public static final String USER_DISABLE = "Disable An User";
  public static final String DISABLE_PROGRAM_USER = "Disable User Of A Program";
  public static final String APPROVE_REJECT_USER = "Approve Or Reject An User";
  public static final String CHANGE_PASSWORD = "Change Password Of An User";
  public static final String CREATE_GROUP = "Creates A New group";
  public static final String GROUP_DETAILS = "Get Details of A Group";
  public static final String GROUP_UPDATE = "Update Existing Group Details ";
  public static final String GROUP_DISABLE = "Disable A Group";
  public static final String GROUP_DELETE = "Delete A Group";
  public static final String GROUP_LIST = "List Of Groups In A Program";
  public static final String GROUP_SUPERVISOR_LIST = "Get Supervisors List";
  public static final String GROUP_MEMBER_LIST = "Get Members List";
  public static final String CREATE_PROGRAM = "Create A New Program";
  public static final String PROGRAM_UPDATE = "Update Program Details";
  public static final String PROGRAM_DETAILS = "Get Details of A Program";
  public static final String PROGRAMS_LIST = "List Of Programs";
  public static final String PROGRAM_USERS_LIST = "List Of Users In Program";
  public static final String ROLE_LIST = "List Of Roles";
  public static final String CREATE_PATIENT = "Create New Patients";
  public static final String UPDATE_PATIENT = "Update Patient";
  public static final String COMPLETE_USER_LIST = "Get All Users List";
  public static final String UPCOMING_PATIENT_SESSION_LIST = "Get Upcoming Session Patient List";
  public static final String PATIENT_LIST = "Get Patient List";
  public static final String USER_REMOVE_CHECK = "Check If User Can Be Removed";
  public static final String FORM = "Form";
  public static final String FILE = "File";
  public static final String INTERVENTION = "Intervention";
  public static final String SESSION = "Session";
  public static final String PATIENT = "Patient";
  public static final String FORM_CREATE_DOC = "Creates a new form";
  public static final String PROVIDE_VALID_INPUTS = "Please provide valid input values";
  public static final String FORM_MODEL = "form";
  public static final String FORM_APPLICANT_MODEL = "formApplicant";
  public static final String FORM_GET_ALL_DOC = "Fetch all forms list";
  public static final String FORM_APPLICANT_SAVE_DOC = "Creates a new form applicant";
  public static final String FORM_APPLICANTS_GET_ALL_DOC = "Fetch all applicants of a form";
  public static final String FORM_STATUS_UPDATE_DOC = "Publish a form";
  public static final String FORM_ENABLE_DISABLE_DOC = "Enable/Disable a form";
  public static final String FORM_GET_ONE_DOC = "Fetch form details";
  public static final String FORM_GET_ALL_DETAILED_DOC = "Fetch all forms list with details ";
  public static final String FORM_GET_ALL_FORM_IDS_DOC = "Fetch all forms ids";
  public static final String GET_ALL_INTERVENTION_IDS_DOC = "Fetch all interventions ids";
  public static final String REPORT = "Report";
  public static final String SANGATH_HOME_DETAILS = "Sangath Home Details";
  public static final String APPLY_IN_PROGRAM = "Apply In A Program";
  public static final String PROFILE_DETAILS = "Get Profile Details";
  public static final String INTERVENSION_DROPDOWN = "Get Intervension Dropdown";
  public static final String SHARE_EMR = "Share EMR";
  public static final String SHARE_EMR_WITH = "Share EMR With";
  public static final String SHARED_EMR_DETAILS = "Get Shared EMR Details";
  public static final String REVOKE_SHARED_EMR_DETAILS = "Revoke Shared EMR Details";
  public static final String SHARED_EMR_LIST = "Get Shared EMR List";
  public static final String COUNSELOR_LIST = "Get Seniorcounselor's counselors";
  public static final String SENIORCOUNSELOR_LIST = "Get Supervisor's seniorcounselors";
  public static final String TRANSFER_PATIENT = "Transfer A Patient";
  public static final String OTHER_USER_LOG_IN = "Users Login (except Super Admin/Admin)";
  public static final String MY_SCHEDULE = "Get My Schedule Details";
  public static final String EDIT_PROFILE = "Update Profile Details";
  public static final String MY_MOBILE_SCHEDULE = "Get My Schedules(Mobile)";
  public static final String PATIENT_DETAILS = "Get Patient Details";
  public static final String APPROVE_REJECT_USER_ROLE = "approve/Reject User Role";
  public static final String ASSIGNEE_MEMBER_LIST = "Assignee List";
  public static final String SUPERVISOR_LIST = "Program Supervisors List";
  public static final String PROGRAM_SENIORCOUNSELOR_LIST = "Program Seniorcounselor List";
  public static final String PROGRAM_COUNSELOR_LIST = "Program Counselors List";
  public static final String TRANSFER_PATIENT_DETAILS = "Get Transfer Patient Details";
  public static final String GET_USER_PROGRAM_ROLES = "Get User Program Roles";
  public static final String ALL_PATIENT_LIST = "Get All Patients List";
  public static final String RESET_USER_PASSWORD = "Reset User Password(By SuperAdmin/ Admin)";
  public static final String MOBILE_USER_LOG_IN = "Mobile Users Login";
  public static final String PATIENT_SESSION_STATUS = "Get Patient Sessions Status";
  public static final String USERS_DETAILS_BASED_ON_CONTACT = "User Details Based On Contact";
  public static final String FETCH_PATIENT_DETAILS = "Fetch details of patients and their completed session's";
  public static final String FETCH_ANSWERED_QUESTIONS = "Get all the answered question's without including file type question. ";
  public static final String FETCH_FORM_IDS = "Service to get list of form id's for a particular session.";
  public static final String FETCH_FORM = "Fetch form";
  public static final String FETCH_REPORT = "Fetch details of all the reports";
  public static final String FETCH_REPORT_TYPES = "Fetch details of all the reports";
  public static final String SAVE_REPORT = "Save report";
  public static final String FETCH_DETAILED_REPORTS = "Fetch report details of all the patients with question's and answer's";
  public static final String GET_SESSION_STATUS = "Get the status of session";
  public static final String UPDATES_A_TEMPLATE = "Updates a template";
  public static final String SAVES_A_TEMPLATE = "Saves a template.";
  public static final String UPDATED_SUCCESSFULLY = "Updated successfully.";
  public static final String TEMPLATE_NOT_FOUND = "Template not found";
  public static final String GET_ALL_ACTIVE_TEMPLATES = "Get all active template's.";
  public static final String GET_SESSION_DETAILS = "Get the detail's of session";
  public static final String ERROR_IN_DELETING_QUESTION = "Error in deleting question.";
  public static final String QUESTIONS_NOT_FOUND = "Question's not found.";
  public static String DELETED_SUCCESSFULLY="Deleted successfully.";
  public static final String GET_ALL_TERMINATED_PATIENT = "Get all terminated patient's";


  // RESPONSE MESSAGES
  public static final String FORM_ERROR_MESSAGE = "Error in saving form.";
  public static final String FORM_UPDATE_ERROR = "Error in updating form.";
  public static final String ADD_DESCRIPTION_MESSAGE = "Please add question description for the languages selected.";
  public static final String FORM_ALREADY_PUBLISHED_ERROR = "Form already published. It can't be edit now.";
  public static final String ADD_ATLEAST_ONE_QUESTION = "Please add atleast one question.";
  public static final String FORM_STATUS_NOT_UPDATED = "Form status not updated.";
  public static final String FORM_PUBLISHED_MESSAGE = "Form successfully published";
  public static final String FORM_NOT_PUBLISHED = "Form not published";
  public static final String IMAGE_NOT_SAVED_ERROR = "Image not saved";
  public static final String PATIENT_NOT_FOUND = "Patient does not exists.";
  public static final String PATIENT_RESPONSES_SAVED_SUCCESS = "Patient responses saved successfully.";
  public static final String SESSIONS_NOT_FOUND = "Sessions not found";
  public static final String SESSION_NOT_FOUND = "Session not found";
  public static final String INTERVENTIONS_NOT_FOUND = "Interventions not found";
  public static final String INTERVENTION_NOT_FOUND = "Intervention does not exists.";
  public static final String INTERVENTION_NOT_CREATED_ERROR = "Error in creating intervention.";
  public static final String QUESTION_IMAGE_NOT_FOUND = "Image not found for question.";
  public static final String OPTION_IMAGE_NOT_FOUND = "Image not found for option.";
  public static final String SOMETHING_WENT_WRONG = "Something went wrong";
  public static final String SESSIONS_UPDATE_FAILED = "Failed to schedule session(s)";
  public static final String TAGS_NOT_FOUND = "tags not found";
  public static final String NOTES_SAVED_SUCCESSFULLY = "notes saved successfully";
  public static final String ANSWER_ID_NOT_FOUND = "answer id not found";
  public static final String FILE_NOT_SAVED_ERROR = "File not saved error.";
  public static final String FILE_SAVED_SUCCESSFULLY = "File saved successfully";
  public static final String THREAD_NOT_FOUND = "thread not found";
  public static final String THREAD_NOT_CREATED_ERROR = "thread not created";
  public static final String RESPONSE_NOT_FOUND = "Response not found";
  public static final String MOBILE_USER_DETAILS = "Get mobile user details";
  public static final String SESSION_NOT_COMPLETED = "Session not completed";
  public static final String SESSION_COMPLETED = "Session  completed";
  public static final String TEMPLATE_NOT_CREATED_ERROR = "Temnplate not created.";
  public static final String TEMPLATE_NAME_ALREADY_EXISTS = "Template name already exists.";
  public static final String ENABLE_DISABLE_TEMPLATE = "Enables/Disables a template.";
  public static final String TEMPLATE_STATUS_NOT_UPDATED = "Template status not updated";
  public static final String GET_TEMPLATE_DETAILS = "Get details of the template's";
  public static final String GET_ALL_TEMPLATES = "Get all template's";
  public static final String ASSIGNEE_NOT_FOUND = "Please add an assignee";
  public static final String ASSIGN_CORRECT_ASSIGNEE = "Please asssign the correct assignee.";
  public static final String DUPLICATE_USER = " Duplicate entries of user found.";
  public static final String ENTER_CORRECT_DETAILS = "Please provide the correct details.";
  public static final String GET_PATIENT_DETAILS = "Get details of patient with filled form's ";
  public static final String TEMPLATE_NOT_UPDATED_ERROR = "Template not updated error.";
  public static final String GET_INTERVENTION_OF_PATIENTS= "Get list of intervention's of patient's of a user within an program";
  public static final String DELETES_MULTIPLE_NEXT_QUESTION = "Delete's multiple next question";
  public static final String TERMINATES_A_PATIENT = "Terminate's a patient.";
  public static final String PATIENT_TERMINATED_SUCCESSFULLY = "Patient terminated successfully.";
  public static final String UNABLE_TO_TERMINATE_PATIENT = "Unable to terminate patient.";
  public static final String GET_REASON_TEMPLATES = "Get reason template's";
  
  // SWAGGER TAGS
  public static final String USER = "user";
  public static final String SESSIONS_UPDATED_SUCCESS = "Session(s) created/updated successfully.";

  // REFERENCE
  public static final String PATIENT_ID = "patientId";
  public static final String PATIENT_NAME = "patientName";
  public static final String INCOMPLETE = "incomplete";
  public static final String ORANGE = "orange";
  public static final String COMPLETE = "complete";
  public static final String GREEN = "green";
  public static final String UPCOMING = "upcoming";
  public static final String BLUE = "blue";
  public static final String STATUS = "status";
  public static final String COLOR = "color";
  public static final String FIRST_NAME = "firstName";
  public static final String LAST_NAME = "lastName";
  public static final String ASSIGNEE_FIRST_NAME = "assigneeFirstName";
  public static final String ASSIGNEE_LAST_NAME = "assigneeLastName";
  public static final String ASSIGNEE_PREFIX = "assigneePrefix";
  public static final String ASSIGNEE_ID = "assigneeId";
  public static final String CONTACT = "contact";
  public static final String PHONE_CODE = "phoneCode";
  public static final String REST_PHONE_CODE = "/{phoneCode}";
  public static final String REST_CONTACT = "/{contact}";
  public static final String ROLE_NAME = "roleName";
  public static final String DELETE = "delete";
  public static final String DISABLE = "disable";
  public static final String NOTES = "notes";
  public static final String REPLY = "reply";
  public static final String SPAM = "spam";
  public static final String RESPONSE = "response";
  public static final String THREAD = "thread";
  public static final String TEMPLATE = "template";
  public static final String IS_ENABLED = "is enabled";
  public static final String IS_DISABLED = "is disabled";
  public static final String CONTACT_BASED = "contact_based";
  public static final String PROGRAM_ID = "programId";
  public static final String ROLE_ID = "roleId";
  public static final String ROLES_INFO = "rolesInfo";
  public static final String FULL_NAME = "fullName";
  public static final String ASSIGNEE_ROLE_NAME = "assignee_role_name";
  public static final String DATEINMILLIS = "dateInMillis";




















}
