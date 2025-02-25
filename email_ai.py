import openai

def summarize_email(email_content):
    response = openai.ChatCompletion.create(
        model="gpt-4",
        messages=[{"role": "system", "content": "Summarize the following email content."},
                  {"role": "user", "content": email_content}]
    )
    return response['choices'][0]['message']['content']

def generate_auto_reply(email_content):
    response = openai.ChatCompletion.create(
        model="gpt-4",
        messages=[{"role": "system", "content": "Generate a professional reply to the following email."},
                  {"role": "user", "content": email_content}]
    )
    return response['choices'][0]['message']['content']
